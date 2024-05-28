USE [DA]
GO
/****** Object:  Table [dbo].[anh_san_pham]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[chi_tiet_don_hang]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[danh_muc]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[don_hang]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[gioi_thieu]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[hinh_anh_page]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[khuyen_mai]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[lien_he]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[nguoi_dung]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[san_pham]    Script Date: 11/05/2024 5:38:43 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[san_pham](
	[id_san_pham] [int] IDENTITY(1,1) NOT NULL,
	[id_danh_muc] [int] NOT NULL,
	[tieu_de] [nvarchar](350) NULL,
	[gia_cu] [int] NULL,
	[gia_moi] [int] NULL,
	[mo_ta] [nvarchar](350) NULL,
	[hinh_anh] [nvarchar](500) NULL,
	[ngay_tao] [nvarchar](15) NULL,
	[ngay_sua] [nvarchar](15) NULL,
 CONSTRAINT [PK_san_pham] PRIMARY KEY CLUSTERED 
(
	[id_san_pham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tin_tuc]    Script Date: 11/05/2024 5:38:43 PM ******/
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
/****** Object:  Table [dbo].[vai_tro]    Script Date: 11/05/2024 5:38:43 PM ******/
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
SET IDENTITY_INSERT [dbo].[nguoi_dung] ON 

INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (4, N'Ta van Tung', N'tungta@gmail.com', N'0123456789', N'Ha Noi', N'123456789', 1)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (5, N'Tong Chinh', N'chinhtong@gmail.com', N'0333838383', N'Ninh Binh', N'123456788', 2)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (6, N'Do Viet Hoang', N'hoang@gmail.com', N'0327584218', N'Hai Phong', N'00000000', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (8, N'Nguyen Thu Trang', N'thutrang@gmail.com', N'0974839075', N'Ha Noi', N'11111111', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (9, N'Ta Thi Ha', N'hata@gmail.com', N'05572525225', N'Ha Noi', N'09876541', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (10, N'He Hue', N'h@gmail.com', N'0123456789', N'Ha Noi', N'123456789', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (11, N'Chu Nguyen', N'nguyen@gmail.com', N'0123456789', N'Ha Noi', N'234567890dfg', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (12, N'ASDF', N'asdfghj@gmail.com', N'0123456789', N'Ha Noi', N'12345678', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (13, N'Nguyen Thanh Dáº¡t', N'thanhdat1204@gmail.com', N'0358434083', N'Phu Xuyen', N'CN5DeIC20psI40wlsULhbmT7xRU=', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (14, N'Ta Thi Ngoc Ha', N'33@gmail.com', N'0357584412', N'Da Nang', N's21AiXnbmOIJh5Mk1bsc3YeU7Lg=', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (15, N'Chu Dinh Nguyen', N'nguyenchu@gmail.com', N'03339039090', N'Thanh HÃ³a', N's21AiXnbmOIJh5Mk1bsc3YeU7Lg=', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (16, N'Đỗ Như Hải', N'hainhu@gmail.com', N'0321131313', N'Thái Nguyên', N'zZezx+GLP+ZOYi30b0G9TwipOho=', 3)
INSERT [dbo].[nguoi_dung] ([id_nguoi_dung], [ho_ten], [email], [so_dien_thoai], [dia_chi], [mat_khau], [id_vai_tro]) VALUES (17, N'Nguyễn Quang Huy', N'huy@gmail.com', N'0974839075', N'Ha Noi', N'15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 3)
SET IDENTITY_INSERT [dbo].[nguoi_dung] OFF
GO
SET IDENTITY_INSERT [dbo].[vai_tro] ON 

INSERT [dbo].[vai_tro] ([id_vai_tro], [ten_vai_tro]) VALUES (1, N'admin')
INSERT [dbo].[vai_tro] ([id_vai_tro], [ten_vai_tro]) VALUES (2, N'admin')
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
