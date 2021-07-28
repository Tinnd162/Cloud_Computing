# Đề tài môn: ĐIỆN TOÁN ĐÁM MÂY
## Tên đề tài: Xây dựng ứng dụng kết hợp nhiều docker với nhau.
### GVHD: Huỳnh Xuân Phụng
### Nhóm SVTH:
  - Phạm Ngọc Hùng - 18133017
  - Nguyễn Đăng Phước Tín - 18133056
### Yêu cầu đề tài:
  - 1 docker chạy web UI (sử dụng .Net Core).
  - 1 docker chạy business (kết nối webserver đến database) sử dụng Java.
  - 1 docker chạy database.
### Hướng dẫn sử dụng:
  - Bước 1: git clone: https://github.com/Tinnd162/Cloud_Computing.git
  - Bước 2: khởi chạy app cùng docker với lệnh "docker-compose up -d"
  - Bước 3: Để dừng app dùng lệnh "docker-compose down" hoặc "docker-compose down -v" để xóa database khi dừng app.
