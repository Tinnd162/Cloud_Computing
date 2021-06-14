// package io.tinnd.lmsapp.model.request;

// // import com.fasterxml.jackson.annotation.JsonProperty;
// // import io.swagger.annotations.ApiModelProperty;
// import lombok.*;
// import javax.validation.constraints.*;

// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// public class CreateUserReq {
//     @NotNull(message = "Tên không được để trống")
//     @NotEmpty(message = "Tên không được để trống")
//     private String firstname;

//     @NotNull(message = "Tên không được để trống")
//     @NotEmpty(message = "Tên không được để trống")

//     private String lastname;

//     @NotNull(message = "Tên không được để trống")
//     @NotEmpty(message = "Tên không được để trống")
//     private String middlename;

//     @NotNull(message = "Số điện thoại không được để trống")
//     @NotEmpty(message = "Số điện thoại không được để trống")
//     private String phone;

//     @NotNull(message = "Email không được để trống")
//     @NotEmpty(message = "Email không được để trống")
//     @Email(message = "Email không đúng định dạng")
//     private String email;

//     @NotNull(message = "Password không được để trống")
//     @NotEmpty(message = "Password không được để trống")
//     @Size(min = 4, max = 50, message = "Mật khẩu phải chứa từ 4-20 ký tự")
//     private String password;

//     @NotNull(message = "Lớp học không được để trống")
//     @NotEmpty(message = "Lớp học không được để trống")
//     private String class_id;

//     @NotNull(message = "Khoa không được để trống")
//     @NotEmpty(message = "Khoa không được để trống")
//     private String faculty_id;
// }
