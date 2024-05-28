USE [DA]
GO
/****** Object:  Table [dbo].[anh_san_pham]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[anh_san_pham](
	[id_anh_san_pham] [int] IDENTITY(1,1) NOT NULL,
	[id_san_pham] [int] NOT NULL,
	[hinh_anh] [nvarchar](500) NULL,
 CONSTRAINT [PK_anh_san_pham] PRIMARY KEY CLUSTERED 
(
	[id_anh_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[chi_tiet_don_hang]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chi_tiet_don_hang](
	[id_ct_don_hang] [int] IDENTITY(1,1) NOT NULL,
	[id_don_hang] [int] NOT NULL,
	[id_san_pham] [int] NOT NULL,
	[gia] [int] NULL,
	[sl_mua] [int] NULL,
 CONSTRAINT [PK_chi_tiet_don_hang] PRIMARY KEY CLUSTERED 
(
	[id_ct_don_hang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[danh_muc]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[danh_muc](
	[id_danh_muc] [int] IDENTITY(1,1) NOT NULL,
	[ten_danh_muc] [nvarchar](250) NULL,
 CONSTRAINT [PK_danh_muc] PRIMARY KEY CLUSTERED 
(
	[id_danh_muc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[don_hang]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[don_hang](
	[id_don_hang] [int] IDENTITY(1,1) NOT NULL,
	[id_nguoi_dung] [int] NOT NULL,
	[ho_ten] [nvarchar](50) NULL,
	[email] [nvarchar](150) NULL,
	[so_dien_thoai] [nvarchar](20) NULL,
	[dia_chi] [nvarchar](500) NULL,
	[note] [nvarchar](350) NULL,
	[ngay_dat] [nvarchar](15) NULL,
	[trang_thai] [nvarchar](50) NULL,
 CONSTRAINT [PK_don_hang] PRIMARY KEY CLUSTERED 
(
	[id_don_hang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gh]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gh](
	[ghid] [int] IDENTITY(1,1) NOT NULL,
	[id_nguoi_dung] [int] NOT NULL,
	[anh] [nvarchar](200) NULL,
	[sanpham] [nvarchar](50) NULL,
	[dongia] [int] NULL,
	[soluong] [int] NULL,
	[thanhtien] [int] NULL,
 CONSTRAINT [PK_gh] PRIMARY KEY CLUSTERED 
(
	[ghid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gioi_thieu]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gioi_thieu](
	[id_gioi_thieu] [int] IDENTITY(1,1) NOT NULL,
	[tieu_de] [nvarchar](250) NULL,
	[noi_dung] [nvarchar](1000) NULL,
	[hinh_anh] [nvarchar](500) NULL,
 CONSTRAINT [PK_gioi_thieu] PRIMARY KEY CLUSTERED 
(
	[id_gioi_thieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[hinh_anh_page]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hinh_anh_page](
	[id_anh_page] [int] IDENTITY(1,1) NOT NULL,
	[hinh_anh] [nvarchar](500) NULL,
 CONSTRAINT [PK_hinh_anh_page] PRIMARY KEY CLUSTERED 
(
	[id_anh_page] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[khuyen_mai]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khuyen_mai](
	[id_khuyen_mai] [int] IDENTITY(1,1) NOT NULL,
	[id_nguoi_dung] [int] NOT NULL,
	[tieu_de] [nvarchar](max) NULL,
	[noi_dung] [nvarchar](max) NULL,
	[hinh_anh] [nvarchar](500) NULL,
 CONSTRAINT [PK_khuyen_mai] PRIMARY KEY CLUSTERED 
(
	[id_khuyen_mai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[lien_he]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lien_he](
	[id_lien_he] [int] IDENTITY(1,1) NOT NULL,
	[id_nguoi_dung] [int] NOT NULL,
	[ho_ten] [nvarchar](50) NULL,
	[email] [nvarchar](150) NULL,
	[so_dien_thoai] [nvarchar](20) NULL,
	[note] [nvarchar](500) NULL,
 CONSTRAINT [PK_lien_he] PRIMARY KEY CLUSTERED 
(
	[id_lien_he] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[nguoi_dung]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nguoi_dung](
	[id_nguoi_dung] [int] IDENTITY(1,1) NOT NULL,
	[ho_ten] [nvarchar](50) NULL,
	[email] [nvarchar](150) NULL,
	[so_dien_thoai] [nvarchar](20) NULL,
	[dia_chi] [nvarchar](100) NULL,
	[mat_khau] [nvarchar](max) NULL,
	[id_vai_tro] [int] NULL,
 CONSTRAINT [PK_nguoi_dung] PRIMARY KEY CLUSTERED 
(
	[id_nguoi_dung] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[san_pham]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[id_san_pham] [int] IDENTITY(1,1) NOT NULL,
	[id_danh_muc] [int] NOT NULL,
	[ten_san_pham] [nvarchar](350) NULL,
	[gia_cu] [int] NULL,
	[gia_moi] [int] NULL,
	[mo_ta] [nvarchar](550) NULL,
	[ngay_tao] [nvarchar](15) NULL,
	[ngay_sua] [nvarchar](15) NULL,
	[hinh_anh] [nvarchar](550) NULL,
	[loai_san_pham] [nvarchar](50) NULL,
	[tinh_trang] [nvarchar](50) NULL,
 CONSTRAINT [PK_san_pham] PRIMARY KEY CLUSTERED 
(
	[id_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tin_tuc]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tin_tuc](
	[id_tin_tuc] [int] IDENTITY(1,1) NOT NULL,
	[id_nguoi_dung] [int] NOT NULL,
	[tieu_de] [nvarchar](250) NULL,
	[noi_dung] [nvarchar](1000) NULL,
	[hinh_anh] [nvarchar](500) NULL,
	[ngay_them] [nvarchar](15) NULL,
 CONSTRAINT [PK_tin_tuc] PRIMARY KEY CLUSTERED 
(
	[id_tin_tuc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[vai_tro]    Script Date: 25/05/2024 9:51:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vai_tro](
	[id_vai_tro] [int] IDENTITY(1,1) NOT NULL,
	[ten_vai_tro] [nvarchar](10) NULL,
 CONSTRAINT [PK_vai_tro] PRIMARY KEY CLUSTERED 
(
	[id_vai_tro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[danh_muc] ON 

INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (1, N'Laptop Acer')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (2, N'Laptop Dell')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (3, N'Laptop Lenovo')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (4, N'Laptop Asus')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (5, N'Laptop HP')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (6, N'MacBook')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (7, N'Các thiết bị sản phẩm khác')
INSERT [dbo].[danh_muc] ([id_danh_muc], [ten_danh_muc]) VALUES (8, N'Sản Phẩm mới')
SET IDENTITY_INSERT [dbo].[danh_muc] OFF
GO
SET IDENTITY_INSERT [dbo].[gh] ON 

INSERT [dbo].[gh] ([ghid], [id_nguoi_dung], [anh], [sanpham], [dongia], [soluong], [thanhtien]) VALUES (2, 63, N'ac1.jpg', N'mac', 1, 1, 1)
INSERT [dbo].[gh] ([ghid], [id_nguoi_dung], [anh], [sanpham], [dongia], [soluong], [thanhtien]) VALUES (3, 64, N'ac1.jpg', N'dell', 1, 1, 1)
SET IDENTITY_INSERT [dbo].[gh] OFF
GO
SET IDENTITY_INSERT [dbo].[hinh_anh_page] ON 

INSERT [dbo].[hinh_anh_page] ([id_anh_page], [hinh_anh]) VALUES (1, N'laptop1.jpg')
INSERT [dbo].[hinh_anh_page] ([id_anh_page], [hinh_anh]) VALUES (2, N'laptop2.png')
INSERT [dbo].[hinh_anh_page] ([id_anh_page], [hinh_anh]) VALUES (3, N'laptop3.png')
SET IDENTITY_INSERT [dbo].[hinh_anh_page] OFF
GO
SET IDENTITY_INSERT [dbo].[nguoi_dung] ON 

INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (23, N'Đào Văn Hùng', N'kthkpkh@gmail.com', N'0345567710', N'Hà Nội', N'7d2d5e675f716a9d71c9199a9118d6016f8530e8f633b0d61134f09130a43f0b', 1)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (65, N'Nguyễn Thu Trang', N'ta@gmail.com', N'0123456789', N'Hà Nội', N'7e071fd9b023ed8f18458a73613a0834f6220bd5cc50357ba3493c6040a9ea8c', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (66, N'Nguyễn Quỳnh Trang', N'trang@gmail.com', N'0327113502', N'Hà Nội', N'7e071fd9b023ed8f18458a73613a0834f6220bd5cc50357ba3493c6040a9ea8c', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (67, N'Chu Đinh Hà', N'hadinh@gmail.com', N'0327113232', N'Đà Nẵng', N'7e071fd9b023ed8f18458a73613a0834f6220bd5cc50357ba3493c6040a9ea8c', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (68, N'Đỗ Tuấn Vũ', N'vu69@gmail.com', N'0321154224', N'Đà Nẵng', N'7e071fd9b023ed8f18458a73613a0834f6220bd5cc50357ba3493c6040a9ea8c', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (69, N'Tống Chinh', N'chinhtong@gmail.com', N'0321121212', N'Ninh Bình', N'7e071fd9b023ed8f18458a73613a0834f6220bd5cc50357ba3493c6040a9ea8c', 1)
SET IDENTITY_INSERT [dbo].[nguoi_dung] OFF
GO
SET IDENTITY_INSERT [dbo].[san_pham] ON 

INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (3, 1, N'Laptop Acer 2022', 37460000, 24990000, N'Nhôm nguyên khối mỏng nhẹ', N'18/5/2024', N'22/5/2024', N'ac2.jpg', N'new', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (4, 6, N'MacBook Ari M3 2022', 36780000, 24430000, N'Nhôm nguyên khối mỏng nhẹ, phù hợp với nhiều ngàng nghề', N'18/5/2024', N'18/5/2024', N'mac4.jpg', N'new', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (5, 7, N'USB MX - 146', 40000, 350000, N'Vỏ nhôm, dung lượng lưu trữ đến 512GB, nhỏ gọn tiện lợi', N'17/5/2024', N'22/5/2024', N'usb1.jpg', N'new', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (9, 7, N'Tai nghe gameming G13', 840000, 630000, N'Chất liệu bằng nhựa, ôm khít đầu khi sử dụng, âm thanh to trong trẻo hay', N'22/5/2024', N'22/5/2024', N'tn1.jpg', N'new', N'hết hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (10, 7, N'Bàn phím led B250 MX', 720000, 640000, N'Đèn sáng 7 màu có thể thay đổi được màu theo ý thích', N'23/5/2024', N'25/5/2024', N'banphim2.jpg', N'new', N'hết hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (11, 4, N'ASUS VIVOBOOK 1375-QP', 32650000, 27990000, N'Mặt lưng nhôm, tỉ lệ màn 16:10 mỏng nhẹ', N'25/5/2024', N'25/5/2024', N'as2.jpg', N'old', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (12, 2, N'Dell vostro 3008', 27990000, 24350000, N'Nhôm nguyên khối mỏng nhẹ, phù hợp với nhiều ngàng nghề', N'25/5/2024', N'25/5/2024', N'del4.jpg', N'old', N'hết hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (13, 3, N'Lenovo ThinkPad 3', 22650000, 18790000, N'Nhôm nguyên khối mỏng nhẹ', N'25/5/2024', N'25/5/2024', N'le2.jpg', N'old', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (14, 5, N'HP omen 2022', 26990000, 20790000, N'Nhựa, tỉ lệ màn 16:10, phù hợp với các game đồ họa cao', N'25/5/2024', N'25/5/2024', N'hp6.jpg', N'old', N'còn hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (15, 2, N'Dell 360', 22690000, 19990000, N'bản lề 360', N'25/5/2024', N'22/5/2024', N'del7.jpg', N'old', N'hết hàng')
INSERT [dbo].[san_pham] ([id_san_pham], [id_danh_muc], [ten_san_pham], [gia_cu], [gia_moi], [mo_ta], [ngay_tao], [ngay_sua], [hinh_anh], [loai_san_pham], [tinh_trang]) VALUES (16, 2, N'Dell MXG', 37650000, 29650000, N'Màng hình cảm ứng, core i7 13700H', N'25/5/2024', N'25/5/2024', N'del8.jpg', N'new', N'còn hàng')
SET IDENTITY_INSERT [dbo].[san_pham] OFF
GO
SET IDENTITY_INSERT [dbo].[vai_tro] ON 

INSERT [dbo].[vai_tro] ([id_vai_tro], [ten_vai_tro]) VALUES (1, N'admin')
INSERT [dbo].[vai_tro] ([id_vai_tro], [ten_vai_tro]) VALUES (2, N'')
INSERT [dbo].[vai_tro] ([id_vai_tro], [ten_vai_tro]) VALUES (3, N'user')
SET IDENTITY_INSERT [dbo].[vai_tro] OFF
GO
ALTER TABLE [dbo].[anh_san_pham]  WITH CHECK ADD  CONSTRAINT [FK_anh_san_pham_san_pham] FOREIGN KEY([id_san_pham])
REFERENCES [dbo].[san_pham] ([id_san_pham])
GO
ALTER TABLE [dbo].[anh_san_pham] CHECK CONSTRAINT [FK_anh_san_pham_san_pham]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FK_chi_tiet_don_hang_don_hang] FOREIGN KEY([id_don_hang])
REFERENCES [dbo].[don_hang] ([id_don_hang])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FK_chi_tiet_don_hang_don_hang]
GO
ALTER TABLE [dbo].[chi_tiet_don_hang]  WITH CHECK ADD  CONSTRAINT [FK_chi_tiet_don_hang_san_pham] FOREIGN KEY([id_san_pham])
REFERENCES [dbo].[san_pham] ([id_san_pham])
GO
ALTER TABLE [dbo].[chi_tiet_don_hang] CHECK CONSTRAINT [FK_chi_tiet_don_hang_san_pham]
GO
ALTER TABLE [dbo].[don_hang]  WITH CHECK ADD  CONSTRAINT [FK_don_hang_nguoi_dung] FOREIGN KEY([id_nguoi_dung])
REFERENCES [dbo].[nguoi_dung] ([id_nguoi_dung])
GO
ALTER TABLE [dbo].[don_hang] CHECK CONSTRAINT [FK_don_hang_nguoi_dung]
GO
ALTER TABLE [dbo].[khuyen_mai]  WITH CHECK ADD  CONSTRAINT [FK_khuyen_mai_nguoi_dung] FOREIGN KEY([id_nguoi_dung])
REFERENCES [dbo].[nguoi_dung] ([id_nguoi_dung])
GO
ALTER TABLE [dbo].[khuyen_mai] CHECK CONSTRAINT [FK_khuyen_mai_nguoi_dung]
GO
ALTER TABLE [dbo].[lien_he]  WITH CHECK ADD  CONSTRAINT [FK_lien_he_nguoi_dung] FOREIGN KEY([id_nguoi_dung])
REFERENCES [dbo].[nguoi_dung] ([id_nguoi_dung])
GO
ALTER TABLE [dbo].[lien_he] CHECK CONSTRAINT [FK_lien_he_nguoi_dung]
GO
ALTER TABLE [dbo].[nguoi_dung]  WITH CHECK ADD  CONSTRAINT [FK_nguoi_dung_vai_tro] FOREIGN KEY([id_vai_tro])
REFERENCES [dbo].[vai_tro] ([id_vai_tro])
GO
ALTER TABLE [dbo].[nguoi_dung] CHECK CONSTRAINT [FK_nguoi_dung_vai_tro]
GO
ALTER TABLE [dbo].[san_pham]  WITH CHECK ADD  CONSTRAINT [FK_san_pham_danh_muc] FOREIGN KEY([id_danh_muc])
REFERENCES [dbo].[danh_muc] ([id_danh_muc])
GO
ALTER TABLE [dbo].[san_pham] CHECK CONSTRAINT [FK_san_pham_danh_muc]
GO
ALTER TABLE [dbo].[tin_tuc]  WITH CHECK ADD  CONSTRAINT [FK_tin_tuc_nguoi_dung] FOREIGN KEY([id_nguoi_dung])
REFERENCES [dbo].[nguoi_dung] ([id_nguoi_dung])
GO
ALTER TABLE [dbo].[tin_tuc] CHECK CONSTRAINT [FK_tin_tuc_nguoi_dung]
GO
