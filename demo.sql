-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 21, 2022 at 12:53 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `demo`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `ano` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `bal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL,
  `c_name` varchar(200) NOT NULL,
  `c_address` varchar(500) NOT NULL,
  `c_contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`c_id`, `c_name`, `c_address`, `c_contact`) VALUES
(34, '', 'alex', 3433),
(3, 'l', '', 2232),
(3, '', 'asda', 23344),
(123, '', 'asd', 34343),
(1, '', 'asdk asdjnjas', 232),
(12, '', 'cd \"c:\\xampp\\tomcat\\webapps\\ROOT\\Sem5Slips\\2\"', 343),
(12, 'asd', 'asdasd', 432),
(2, 'ahashd', 'pune', 1111111111);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `last_name` varchar(64) DEFAULT NULL,
  `first_name` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `department` varchar(64) DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `last_name`, `first_name`, `email`, `department`, `salary`) VALUES
(2, 'Public', 'Mary', 'mary.public@foo.com', 'Engineering', '75000.00'),
(3, 'Queue', 'Susan', 'susan.queue@foo.com', 'Legal', '130000.00'),
(4, 'Williams', 'David', 'david.williams@foo.com', 'Computer Science', '120000.00'),
(5, 'Johnson', 'Lisa', 'lisa.johnson@foo.com', 'Engineering', '50000.00'),
(6, 'Smith', 'Paul', 'paul.smith@foo.com', 'Legal', '100000.00'),
(7, 'Adams', 'Carl', 'carl.adams@foo.com', 'HR', '50000.00'),
(8, 'Brown', 'Bill', 'bill.brown@foo.com', 'Engineering', '50000.00'),
(9, 'Thomas', 'Susan', 'susan.thomas@foo.com', 'Legal', '80000.00'),
(10, 'Davis', 'John', 'john.davis@foo.com', 'HR', '45000.00'),
(11, 'Fowler', 'Mary', 'mary.fowler@foo.com', 'Computer Science', '65000.00'),
(12, 'Waters', 'David', 'david.waters@foo.com', 'Legal', '90000.00'),
(16, 'jay', 'trainee', 'A@gmail.com', 'dept1', '10000.00'),
(17, 'jayes', 'trainee', 'B@gmail.com', 'dept1', '10000.00'),
(18, 'shail', 'trainee', 'C@gmail.com', 'dept1', '10000.00');

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `number` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`number`, `name`, `address`) VALUES
(1, 'ABC', 'ADDRESS FOR ABC'),
(2, 'XYZ', 'ADDRESS FOR XYZ');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `percentage` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `percentage`) VALUES
(12, 'sdf', 0),
(23, 'alex', 34);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `TNo` int(11) DEFAULT NULL,
  `TName` varchar(20) DEFAULT NULL,
  `Sal` int(11) DEFAULT NULL,
  `Desg` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`TNo`, `TName`, `Sal`, `Desg`) VALUES
(12, 'deepa', 290000, 'hod');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
