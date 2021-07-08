using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using MatBlazor;
using Blazorise;
using Blazorise.Bootstrap;
using Blazorise.Icons.FontAwesome;
namespace lms_ui
{
    public class Program
    {
        public static async Task Main(string[] args)
        {
            var builder = WebAssemblyHostBuilder.CreateDefault(args);
            builder.RootComponents.Add<App>("app");

            builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri(builder.HostEnvironment.BaseAddress) });
            builder.Services.AddHttpClient("JsonPlaceHolderClient", client =>
            {
                client.BaseAddress = new Uri("http://localhost:8080");
            });
            builder.Services.AddMatBlazor();
            builder.Services.AddBlazorise();

            builder.Services.AddBootstrapProviders();
            builder.Services.AddFontAwesomeIcons();
            await builder.Build().RunAsync();
        }
    }
}
