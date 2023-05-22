-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2023 at 04:50 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbjewelrydomain`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblitem`
--

CREATE TABLE `tblitem` (
  `id` int(11) NOT NULL,
  `category` varchar(120) NOT NULL,
  `item` varchar(120) NOT NULL,
  `supplier` varchar(120) NOT NULL,
  `customer` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblitem`
--

INSERT INTO `tblitem` (`id`, `category`, `item`, `supplier`, `customer`) VALUES
(1, 'gc ', 'vgav', 'vagv', 'vavg'),
(2, 'saa', 'saa', 'asaf', 'adf'),
(3, 'dv', 'ba', 'bayz', 'vvyv'),
(4, 'ex', ' cX', 'A', 'cG'),
(5, 'gsa', 'vagbs', 'vhy', 'tvycv'),
(6, ' F C', 'xSFCG', 'sagga', 'gasda'),
(7, 'acttr', 'vact', 'tatc', 'vayv'),
(8, '', '', '', ''),
(9, 'fsvy', 'vsy', 'bsus', 'suuuuuuuuuu'),
(10, 'ring', 'gold ring', 'rodltn', 'lynn');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblitem`
--
ALTER TABLE `tblitem`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblitem`
--
ALTER TABLE `tblitem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
