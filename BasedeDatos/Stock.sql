-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2023 a las 00:20:02
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `stock`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id_departamento` int(11) NOT NULL,
  `nombre_departamento` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id_departamento`, `nombre_departamento`) VALUES
(1, 'Limpieza'),
(2, 'Refrescos'),
(3, 'Sabritas'),
(4, 'Lacteos'),
(5, 'Dulces'),
(6, 'Galletas'),
(7, 'Cereales'),
(8, 'Alimentos enlatados'),
(9, 'Embutidos'),
(10, 'Cuidado personal');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `cod_producto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cantidad` int(11) DEFAULT 0,
  `precio_costo` float DEFAULT NULL,
  `precio_venta` float DEFAULT NULL,
  `fecha_registro` date DEFAULT curdate(),
  `folio_factura` varchar(45) DEFAULT NULL,
  `id_departamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`cod_producto`, `nombre`, `cantidad`, `precio_costo`, `precio_venta`, `fecha_registro`, `folio_factura`, `id_departamento`) VALUES
(1, 'Leche Lala', 45, 55, 63.25, '2023-04-01', '53224s', 4),
(2, 'Takis Fuego', 20, 10, 15, '2023-05-25', '643341x', 3),
(3, 'Atún', 30, 25, 28, '2023-04-08', '987654L', 8),
(4, 'Galletas Maria', 53, 10, 12, '2023-06-07', '949392a', 6),
(5, 'Tio Nacho', 22, 70, 98, '2023-03-01', '9849002f', 10),
(6, 'Chetos Flamin Hot', 66, 10, 15, '2023-05-01', '75434214k', 3),
(7, 'Gomitas Panda ', 40, 5, 7.5, '2022-10-23', '6261631m', 5),
(8, 'Jamón de Pavo Fud', 100, 70, 105, '2023-03-03', '34r5114k', 9),
(9, 'Corn flakes', 20, 50, 75, '2023-04-15', '5892182489k', 7),
(11, 'Sabritas', 50, 15, 18, '2023-05-01', '5678f', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `cod_proveedor` int(11) NOT NULL,
  `nombre_proveedor` varchar(45) NOT NULL,
  `telefono` char(20) NOT NULL,
  `departamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`cod_proveedor`, `nombre_proveedor`, `telefono`, `departamento`) VALUES
(1, 'Grabiel', '9331664215', 3),
(2, 'Ricardo', '9336437884', 5),
(3, 'Fernado Torres', '9776543223', 6),
(4, 'Sebastian', '9776543223', 8),
(5, 'Luis Alfonso', '9776543223', 4),
(6, 'Ruth Estefania', '9921346765', 10),
(7, 'Plinio', '345678', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `tipo_usuario` varchar(35) NOT NULL,
  `contrasena` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`tipo_usuario`, `contrasena`) VALUES
('Administrador', 'admin'),
('Empleado', 'user');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id_departamento`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`cod_producto`),
  ADD KEY `id_departamento` (`id_departamento`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`cod_proveedor`),
  ADD KEY `departamento` (`departamento`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`tipo_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id_departamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `cod_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `cod_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_2` FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id_departamento`);

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`departamento`) REFERENCES `departamento` (`id_departamento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
