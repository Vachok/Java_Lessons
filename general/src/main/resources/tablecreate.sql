-- phpMyAdmin SQL Dump
-- version 4.0.10.20
-- https://www.phpmyadmin.net
--
-- Хост: localhost
-- Время создания: Июл 21 2018 г., 21:22
-- Версия сервера: 5.6.39-83.1
-- Версия PHP: 5.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `u0466446_lessons`
--

-- --------------------------------------------------------

--
-- Структура таблицы `general`
--

CREATE TABLE IF NOT EXISTS ? (
  `identry` int(11) NOT NULL AUTO_INCREMENT,
  `idlesson` double NOT NULL,
  `lessonname` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `links` text COLLATE utf8_unicode_ci,
  `timeset` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`identry`),
  UNIQUE KEY `idlesson` (`idlesson`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
