FROM mcr.microsoft.com/dotnet/sdk:3.1 AS build-env
RUN  mkdir /lms-ui
WORKDIR /lms-ui

COPY *.csproj .
RUN dotnet restore "lms-ui.csproj"
COPY . .
RUN dotnet build "lms-ui.csproj" -c Release -o /build

FROM build-env AS publish
RUN dotnet publish "lms-ui.csproj" -c Release -o /publish

FROM nginx:alpine AS final
WORKDIR /usr/share/nginx/html

COPY --from=publish /publish/wwwroot /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf