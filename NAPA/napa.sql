-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 05, 2018 at 11:05 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `napa`
--

-- --------------------------------------------------------

--
-- Table structure for table `captains`
--

CREATE TABLE `captains` (
  `idc` int(9) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `telephone` varchar(30) DEFAULT NULL,
  `idNumber` bigint(15) DEFAULT NULL,
  `license` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `captains`
--

INSERT INTO `captains` (`idc`, `firstName`, `lastName`, `address`, `telephone`, `idNumber`, `license`) VALUES
(6, 'Popa', 'Vasile', 'Ialomita', '0728646546', 1960222463513, 21678),
(7, 'Andrei', 'Ion', 'Galati', '0785464654', 1952354613212, 84987);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `password`) VALUES
('Vali', '1234'),
('admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `ships`
--

CREATE TABLE `ships` (
  `ids` int(9) NOT NULL,
  `idc` int(9) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(30) DEFAULT NULL,
  `objective` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ships`
--

INSERT INTO `ships` (`ids`, `idc`, `name`, `description`, `objective`) VALUES
(68748, 6, 'Ship1', 'ship1desc', 'River'),
(89765, 7, 'Ship2', 'Ship2desc', 'Sea');

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `idu` int(9) DEFAULT NULL,
  `ids` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`idu`, `ids`) VALUES
(9, 89765),
(8, 89765);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idu` int(9) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `idnumber` bigint(15) DEFAULT NULL,
  `post` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`idu`, `firstName`, `lastName`, `address`, `telephone`, `idnumber`, `post`) VALUES
(8, 'Mihnea', 'Vasile', 'Arad', '0725654233', 1956583521321, 'Inginer'),
(9, 'Antoh', 'Diana', 'Timisoara', '0785464321', 285651548999, 'Programmer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `captains`
--
ALTER TABLE `captains`
  ADD PRIMARY KEY (`idc`);

--
-- Indexes for table `ships`
--
ALTER TABLE `ships`
  ADD PRIMARY KEY (`ids`),
  ADD KEY `idc_fk` (`idc`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD KEY `ids_fk` (`ids`),
  ADD KEY `idu_fk` (`idu`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idu`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `captains`
--
ALTER TABLE `captains`
  MODIFY `idc` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `ships`
--
ALTER TABLE `ships`
  MODIFY `ids` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89766;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `idu` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `team`
--
ALTER TABLE `team`
  ADD CONSTRAINT `ids_fk` FOREIGN KEY (`ids`) REFERENCES `ships` (`ids`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idu_fk` FOREIGN KEY (`idu`) REFERENCES `users` (`idu`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
