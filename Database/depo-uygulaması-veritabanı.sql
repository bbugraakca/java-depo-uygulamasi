-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 10 Ara 2019, 19:32:25
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `depolama`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `brand`
--

CREATE TABLE `brand` (
  `Id` int(10) NOT NULL,
  `BrandName` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `CategoryName` varchar(30) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `brand`
--

INSERT INTO `brand` (`Id`, `BrandName`, `CategoryName`) VALUES
(18, 'Casper', ''),
(19, 'Razer', ''),
(20, 'Logitech', ''),
(21, 'LG', ''),
(22, 'Asus', ''),
(23, 'Kaizen', 'Mouse'),
(25, 'HP', 'Laptop'),
(26, 'Everest', 'Wifi'),
(27, 'TP-Link', 'Wifi'),
(28, 'A4', 'Klavye');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `cart`
--

CREATE TABLE `cart` (
  `Id` int(11) NOT NULL,
  `BarcodeNo` int(11) NOT NULL,
  `ProductName` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `StockAmount` int(10) NOT NULL,
  `Category` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `Brand` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `PurchasePrice` decimal(10,2) NOT NULL,
  `SalePrice` decimal(10,2) NOT NULL,
  `ShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `BottomShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `CustomerName` varchar(100) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `cart`
--

INSERT INTO `cart` (`Id`, `BarcodeNo`, `ProductName`, `StockAmount`, `Category`, `Brand`, `PurchasePrice`, `SalePrice`, `ShelfNo`, `BottomShelfNo`, `CustomerName`) VALUES
(8, 2345678, 'Gaming Mouse C201', 1, 'Mouse', 'Casper', '5212.00', '12999.00', 'A10', 'B2', 'BoozSoft Bilişim Hizmetleri A.Ş.');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `Id` int(11) NOT NULL,
  `CategoryName` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `BrandName` varchar(30) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `category`
--

INSERT INTO `category` (`Id`, `CategoryName`, `BrandName`) VALUES
(21, 'Mouse', ''),
(22, 'Klavye', ''),
(23, 'Laptop', ''),
(24, 'Wifi', ''),
(26, 'Kasa', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customerlist`
--

CREATE TABLE `customerlist` (
  `Id` int(10) NOT NULL,
  `tc_vergi_no` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `isim_sirket_kisi` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `telefon` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `telefon2` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `adres` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `date` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `dateCode` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `customerlist`
--

INSERT INTO `customerlist` (`Id`, `tc_vergi_no`, `isim_sirket_kisi`, `telefon`, `telefon2`, `adres`, `email`, `date`, `dateCode`) VALUES
(2, '21364597852', 'BoozSoft Bilişim Hizmetleri A.Ş.', '0541564654', '564546', 'Köşklüçeşme Mah. 10 Sk. No:21 Gebze/Kocaeli', 'gurgen.ozgur@outlook.com', '', 0),
(6, '6516546545', 'Aselsan A.Ş.', '0212652312', '02623256565', 'Keçiören Ankra', 'yonetici@aselsan.com', '', 0),
(49, '56654541', 'BoozSoft', 'asdasd', '564654', 'asdasd', 'asdasd@sad.asd', '', 0),
(50, '46546546546', 'yaptık oldu a.ş.', '02621111', '02321111', 'ankarar', 'admin@aselsan.com', '', 0),
(51, '123', 'asd', '123', '123', 'asd', 'asd', '02/04/2019 23:25:17', 2042019),
(52, '651654654', 'eray akbaş', '051654654', '054654654', 'güzeller', 'eray@gmail.com', '04/04/2019 22:39:01', 20190404),
(53, '52452584523', 'denemeler diyarı', '554160415', '0**********', 'moda mh moda cad no:1 Hakkari', 'deneme@deneme.com', '07/12/2019 06:58:34', 20191207);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `productlist`
--

CREATE TABLE `productlist` (
  `Id` int(20) NOT NULL,
  `BarcodeNo` int(20) NOT NULL,
  `ProductName` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `StockAmount` int(10) NOT NULL,
  `Category` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `Brand` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `PurchasePrice` decimal(10,2) NOT NULL,
  `SalePrice` decimal(10,2) NOT NULL,
  `ShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `BottomShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `Date` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `DateCode` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `productlist`
--

INSERT INTO `productlist` (`Id`, `BarcodeNo`, `ProductName`, `StockAmount`, `Category`, `Brand`, `PurchasePrice`, `SalePrice`, `ShelfNo`, `BottomShelfNo`, `Date`, `DateCode`) VALUES
(7, 1234567, 'Gaming Mouse RTX203', 200, 'Mouse', 'Razer', '50.12', '102.99', 'A10', 'B1', '03/04/2019 16:13:44', 20190403),
(8, 2345678, 'Gaming Mouse C201', 200, 'Mouse', 'Casper', '52.12', '129.99', 'A10', 'B2', '03/04/2019 16:15:00', 20190403),
(9, 3456789, 'Asus ZenBook', 101, 'Laptop', 'Asus', '4099.99', '4799.99', 'A3', 'B12', '03/04/2019 16:17:12', 20190403),
(10, 4567891, 'Slient Tech Sessiz Kasa', 78, 'Kasa', 'Casper', '2099.99', '2499.99', 'A7', 'B1', '03/04/2019 16:18:17', 20190403),
(11, 5678912, 'G4 H815 Telefon', 127, 'Wifi', 'LG', '999.00', '2099.99', 'A7', 'B8', '03/04/2019 16:19:17', 20190403),
(12, 123123123, 'Gamin', 123, 'Laptop', 'HP', '213123.00', '123123.00', '213', '123', '03/04/2019 19:34:23', 20190403),
(13, 7891234, 'SuperMouse 2000X', 299, 'Mouse', 'Kaizen', '119.99', '229.99', 'A21', 'B2', '03/04/2019 19:40:50', 20190403);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `saleproducts`
--

CREATE TABLE `saleproducts` (
  `Id` int(10) NOT NULL,
  `CustomerName` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `BarcodeNo` int(20) NOT NULL,
  `ProductName` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `StockAmount` int(10) NOT NULL,
  `Category` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `Brand` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `PurchasePrice` decimal(10,2) NOT NULL,
  `SalePrice` decimal(10,0) NOT NULL,
  `ShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `BottomShelfNo` varchar(5) COLLATE utf8_turkish_ci NOT NULL,
  `Date` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `DateCode` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `saleproducts`
--

INSERT INTO `saleproducts` (`Id`, `CustomerName`, `BarcodeNo`, `ProductName`, `StockAmount`, `Category`, `Brand`, `PurchasePrice`, `SalePrice`, `ShelfNo`, `BottomShelfNo`, `Date`, `DateCode`) VALUES
(7, 'BoozSoft Bilişim Hizmetleri A.Ş.', 1234567, 'Gaming Mouse RTX203', 1, 'Mouse', 'Razer', '50.12', '103', 'A10', 'B1', '03/04/2019 16:24:17', 20190403),
(8, 'BoozSoft Bilişim Hizmetleri A.Ş.', 2345678, 'Gaming Mouse C201', 1, 'Mouse', 'Casper', '52.12', '130', 'A10', 'B2', '03/04/2019 16:24:17', 20190403),
(9, 'BoozSoft Bilişim Hizmetleri A.Ş.', 3456789, 'Asus ZenBook', 1, 'Laptop', 'Asus', '4099.99', '4800', 'A3', 'B12', '03/04/2019 16:24:17', 20190403),
(11, 'BoozSoft Bilişim Hizmetleri A.Ş.', 5678912, 'G4 H815 Telefon', 1, 'Wifi', 'LG', '999.00', '2100', 'A7', 'B8', '03/04/2019 16:24:17', 20190403),
(7, 'BoozSoft Bilişim Hizmetleri A.Ş.', 1234567, 'Gaming Mouse RTX203', 1, 'Mouse', 'Razer', '50.12', '103', 'A10', 'B1', '04/04/2019 22:43:44', 20190404),
(8, 'BoozSoft Bilişim Hizmetleri A.Ş.', 2345678, 'Gaming Mouse C201', 1, 'Mouse', 'Casper', '52.12', '130', 'A10', 'B2', '04/04/2019 22:43:44', 20190404),
(13, 'BoozSoft Bilişim Hizmetleri A.Ş.', 7891234, 'SuperMouse 2000X', 1, 'Mouse', 'Kaizen', '119.99', '230', 'A21', 'B2', '04/04/2019 22:43:44', 20190404);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sales`
--

CREATE TABLE `sales` (
  `Id` int(10) NOT NULL,
  `CustomerName` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `SaleAmount` int(5) NOT NULL,
  `TotalPrice` decimal(10,2) NOT NULL,
  `SellerName` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `Date` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `DateCode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `sales`
--

INSERT INTO `sales` (`Id`, `CustomerName`, `SaleAmount`, `TotalPrice`, `SellerName`, `Date`, `DateCode`) VALUES
(48, 'BoozSoft Bilişim Hizmetleri A.Ş.', 4, '234.96', 'ozgurgurgen', '03/12/2019 16:24:18', 20191203),
(49, 'BoozSoft Bilişim Hizmetleri A.Ş.', 3, '462.97', 'ozgurgurgen', '04/04/2019 22:43:44', 20190404);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `users`
--

CREATE TABLE `users` (
  `Id` int(11) NOT NULL,
  `userName` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `firstName` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `lastName` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `authorization` varchar(10) COLLATE utf8_turkish_ci NOT NULL,
  `date` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `dateCode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `users`
--

INSERT INTO `users` (`Id`, `userName`, `password`, `firstName`, `lastName`, `authorization`, `date`, `dateCode`) VALUES
(4, 'ozgurgurgen', 'ozgur1234', 'Özgür', 'GÜRGEN', 'Yönetici', '0000-00-00 00:0', 0),
(9, 'yonetici', 'demo', 'Yönetici', 'Demo', 'Yönetici', '07/12/2019 07:00:11', 20191207),
(10, 'personel', 'demo', 'Personel', 'DEMO', 'Personel', '07/12/2019 07:00:29', 20191207);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `customerlist`
--
ALTER TABLE `customerlist`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `productlist`
--
ALTER TABLE `productlist`
  ADD PRIMARY KEY (`Id`,`BarcodeNo`);

--
-- Tablo için indeksler `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `brand`
--
ALTER TABLE `brand`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Tablo için AUTO_INCREMENT değeri `category`
--
ALTER TABLE `category`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Tablo için AUTO_INCREMENT değeri `customerlist`
--
ALTER TABLE `customerlist`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- Tablo için AUTO_INCREMENT değeri `productlist`
--
ALTER TABLE `productlist`
  MODIFY `Id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `sales`
--
ALTER TABLE `sales`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- Tablo için AUTO_INCREMENT değeri `users`
--
ALTER TABLE `users`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
