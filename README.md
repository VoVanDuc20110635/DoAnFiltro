![data angular thread-overview.png](frontend%2Ffiltro_jwt%2Fknowledge%2Fdata%20angular%20thread-overview.png)

Source nguồn front-end: https://github.com/Arkadian404/filtro_jwt.git
Source nguồn back-end: https://github.com/Arkadian404/filtro_jwt_backend.git
Source nguồn fast-api: https://github.com/Arkadian404/recommender_system_api.git

# Phân công
### Giai đoạn 1: 07/2023 - 12/2023

#### Võ Văn Đức (25-30%)
- Xây dựng cấu trúc source code cho back-end Spring Boot (Model, Database) và front-end Angular
- Cấu hình security cho back-end
- Thực hiện chức năng trang home, cart, checkout, trang quản lý sản phẩm và hình ảnh sản phẩm
- Thực hiện chức năng thanh toán Momo
- Viết tài liệu

#### Ôn Gia Phú (65-70%)
- Thực hiện các chức năng quản lý các thông tin ở trang quản trị, thống kê
- Thực hiện chức năng:
  - Đăng nhập (giao diện), đăng ký, quên mật khẩu
  - Xem, lọc danh sách sản phẩm; tìm kiếm sản phẩm; chi tiết sản phẩm; bình luận sản phẩm
  - Sự kiện giảm giá; sử dụng API giao hàng nhanh
- Thực hiện chức năng thanh toán Vnpay

### Giai đoạn 2: 01/2024 - 07/2024

### Hệ thống gợi ý sản phẩm dựa trên hành vi người dùng – thuật toán KNearest Neighbor KNN

#### Võ Văn Đức
- Tiền xử lý dữ liệu
- Xác thực mô hình
- Chọn K
- Xây dựng hàm

#### Ôn Gia Phú
- Xây dựng hàm (chính)
- Xây dựng UI/UX

### Chatbot AI với Model LLM của Open AI

#### Võ Văn Đức
- Kiểm tra với Model LLM của Hugging Face
- Viết Prompt cho Chatbot
- Xây dựng hàm

#### Ôn Gia Phú
- Xây dựng hàm (chính)
- Xây dựng UI/UX

### Triển khai dự án sử dụng VPS, Docker Compose, Nginx



# Filtro - Project Overview
- URL: https://filtrocoffee.com/home
- This project aims to replicate the functionality of an e-commerce website. It offers a comprehensive suite of features that cater to both customers and store managers.
  
# Technologies Used
- Front-end: Angular
- Backend: Spring Boot
- Database: SQL
- Recommender System: K-nearest neighbors (KNN) via the Surprise library of Python
- ChatbotAI: the LLM of OpenAI via the LangChain library of Python

## Features

### For Customers
- **Store Information**: Provides details about the store.
- **Order Placement**: Allows customers to place orders for their desired products.
- **Payment Gateway**: Facilitates payment transactions for purchases through the Momo e-wallet and the VnPay payment gateway.
- **Recommender System**: Propose 10 products for the user.
- **Chatbot AI**: Users can quickly look up information through the AI chatbot system via OpenAI's LLM.

### For Store Management
- **User Information Management**: Handles the data related to store users.
- **Product Management**: Involves adding, updating, and removing products.
- **Order Management**: Tracks and manages customer orders.
- **User Role Assignments**: Administers the roles and permissions of users on the website.

## Admin Account

**Username**: admin  
**Password**: Piotthed@rkness1

## Main Features

### E-commerce Functionalities
- Provided functionalities of an e-commerce website, including viewing items, managing the shopping cart, order placing for customers, and shop management for employees.

### Security
- Utilized Spring Security and JWT tokens for managing authentication and authorization.

### Payment Integration
- Payment is handled through Momo e-wallet and Vnpay payment gateway.

### Recommender System
- Implement the product recommendation system using the K-nearest neighbors (KNN) algorithm through the Surprise library in Python.
- Propose 10 products for the user after login.
  - If there are no confirmed orders, there will be no product recommendation system.
  - If there are any confirmed orders in the user's account and the user hasn't commented on any product, the system suggests the 10 highest-rated products in the database.
  - If there is a confirmed order, the system suggests the 10 highest-rated products based on previous reviews from this account.

### Chatbot AI
- Users can quickly look up information through the AI chatbot system via OpenAI's LLM.

# ===================================================================================================================

## 1. Provided functionalities of an e-commerce website, including viewing items, managing the shopping cart, order placing for customers, and shop management for employees.

### 1.1. Account registration and login
- Registration
  ![image](https://github.com/user-attachments/assets/07eb20e4-3ab4-4074-ae42-18b33b670715)

- Register successfully
  ![image](https://github.com/user-attachments/assets/969e9722-4980-4919-80d0-c11d36b5d07f)

- Login
  ![image](https://github.com/user-attachments/assets/e2899586-298e-4910-b553-1721a0d9367c)

- Login successfully
  ![image](https://github.com/user-attachments/assets/b0de0b7a-d89c-457a-9ed8-8ab3df108c7a)


### 1.2. View homepage, products, product details
![image](https://github.com/user-attachments/assets/a786fca1-2adc-4d9d-9eec-eab918e7c903)
![image](https://github.com/user-attachments/assets/4bace0ae-7e80-467a-8cfd-ab794a77993f)
![image](https://github.com/user-attachments/assets/8c3961a3-f129-4e38-85b6-9685cd064e4f)

### 1.3. View, add, remove products from the shopping cart
![image](https://github.com/user-attachments/assets/1a2c180d-6c5d-4bd2-8eea-1825f2cf1418)
![image](https://github.com/user-attachments/assets/4c744de0-d5f5-489e-adf1-fa4501552d82)

### 1.4. Place Cash on Delivery (COD) orders
- Used API of GiaoHangNhanh
![image](https://github.com/user-attachments/assets/1c799409-dcd3-45bc-8d5f-84938c98da62)
![image](https://github.com/user-attachments/assets/1abe320b-deec-428c-9fee-ccb9e14f6c97)
![image](https://github.com/user-attachments/assets/de21dcfa-23ef-47b2-97ee-732cbd760a3f)
![image](https://github.com/user-attachments/assets/e06f97d5-0b60-440b-b340-adaa1f7776e4)

## 2. Payment is handled through Momo e-wallet and Vnpay payment gateway.

### 2.1. Payment through Momo e-wallet
![image](https://github.com/user-attachments/assets/58f66d63-b5f4-4318-a62a-4cd4aacb6de1)
![image](https://github.com/user-attachments/assets/51b3e2c6-7ce3-475c-b77e-94f81cc1e10f)

- At the homepage of Momo's application

  <img src="https://github.com/user-attachments/assets/49b73390-8173-45ea-891f-36e725b69b3a" height="500">
  <img src="https://github.com/user-attachments/assets/1e2d6957-4edc-485a-b811-659ea7edd5df" height="500">
  <img src="https://github.com/user-attachments/assets/2d5b2a7e-9263-4a59-b56e-42c8f63eb8ab" height="500">


- After check out successfully, the webpage is reset.
![image](https://github.com/user-attachments/assets/6a23578b-25bc-4ba2-9cef-8bc52989bc1e)
![image](https://github.com/user-attachments/assets/60a41e97-398e-4f24-90ad-97c098df6b4f)
![image](https://github.com/user-attachments/assets/adcdecd5-f71a-4bc4-9c33-a20eb39195de)

### 2.2. Payment through Vnpay payment gateway
![image](https://github.com/user-attachments/assets/a781f52f-234b-4285-8a1b-8354a8d9b75a)
![image](https://github.com/user-attachments/assets/5970c775-24a4-42a1-baab-d12d8789dda9)
![image](https://github.com/user-attachments/assets/170cb12f-8ac2-4302-bd61-ca42b7f1e066)
![image](https://github.com/user-attachments/assets/0d41b3ff-2ed5-469d-956b-6c7f54460147)
![image](https://github.com/user-attachments/assets/d8d8ad54-c8c7-431c-bae9-3bf385b229ea)
![image](https://github.com/user-attachments/assets/3f369dea-d5a3-4732-9d3e-2ec110433f91)

## 3. Utilized Spring Security and JWT tokens for managing authentication and authorization.

### 3.1. JWT tokens and permissions
![image](https://github.com/user-attachments/assets/42863f1d-9e63-4afa-b5e2-aec55ec47031)
![image](https://github.com/user-attachments/assets/0950d47a-392d-4832-a660-ce58ddad509c)

- Before check the token, let's create a new employee's account with account name is "employee02" and password is "Duc2112002@"
![image](https://github.com/user-attachments/assets/f1ec5f28-0a5f-41cb-97ad-abb2cbe73fbf)

- Here is token in the request from employee's account:
![image](https://github.com/user-attachments/assets/dbf13372-d973-418e-9fb9-0636d7bcd605)
![image](https://github.com/user-attachments/assets/3c1be868-a95d-4370-88b4-d4d812f78272)

- The account permissions are hard-coded and cannot be modified.
- Employees cannot access the employee management page https://filtrocoffee.com/admin/employee
Here is the admin's account:
![image](https://github.com/user-attachments/assets/1d2bfdaa-2ecf-4d6f-b70e-bfac013c0c23)

Here is the employe's account:

![image](https://github.com/user-attachments/assets/a9a55daf-2c7f-4479-976f-a4c73ef2db6e)

After employee's account access the employee management page https://filtrocoffee.com/admin/employee, the website will return to the home page https://filtrocoffee.com/admin/home


### 3.2. Incorrect login
![image](https://github.com/user-attachments/assets/8b2f756f-efb1-4527-9e2e-3da2c948121b)

### 3.3. Access denied when trying to access unauthorized areas (before and after login)
- Without login: Let's access this url without login: https://filtrocoffee.com/admin/employee, the website will return to the admin login page.

- After login, the website will return to the home page of shop.

## 4. Recommender System.
- If there are any confirmed orders in the user's account and the user hasn't commented on any product, the system suggests the 10 highest-rated products in the database.
- If there is a confirmed order, the system suggests the 10 highest-rated products based on previous reviews from this account.

![img_2.png](img_2.png)

![img_3.png](img_3.png)

![img_4.png](img_4.png)

![img_5.png](img_5.png)

![img_1.png](img_1.png)

![image](https://github.com/user-attachments/assets/1c3debf1-9b60-49b8-a4e9-0e5fa93a8124)

## 5. Chatbot AI.
![img.png](img.png)

![image](https://github.com/user-attachments/assets/59a225cc-0925-4792-99ee-f571b11bbdff)

<img src="https://github.com/user-attachments/assets/521ff79e-0d24-4543-ac1a-df171884f792" height="500">
