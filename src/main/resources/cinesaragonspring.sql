-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2021 a las 18:13:41
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinesaragonspring`
--

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id`, `nombre`) VALUES
(1, 'Accion'),
(2, 'Aventura'),
(3, 'Terror'),
(4, 'Ciencia ficcion');

--
-- Volcado de datos para la tabla `horarios`
--

INSERT INTO `horarios` (`id`, `hora`) VALUES
(1, '16:00'),
(2, '16:30'),
(3, '17:00'),
(4, '17:30'),
(5, '18:00'),
(6, '18:30'),
(7, '19:00'),
(8, '19:30'),
(9, '20:00'),
(10, '20:30'),
(11, '21:00'),
(12, '21:30'),
(13, '22:00'),
(14, '22:30'),
(15, '23:00'),
(16, '23:30');

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`id`, `cartel`, `duracion`, `fecha_estreno`, `genero`, `precio`, `sinopsis`, `titulo`, `votos`) VALUES
(2, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/quWP5VIzTUf0Hr8AJZLloM6js8I.jpg', 121, '2019', 4, '5.50', 'Cuando Alita (Rosa Salazar) se despierta sin recordar quién es en un mundo futuro que no reconoce, Ido (Christoph Waltz), un médico compasivo, se da cuenta de que en algún lugar de ese caparazón de cyborg abandonado, está el corazón y alma de una mujer jo', 'Alita, Battle Angel ', 100),
(3, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iaiy3tg9QVkDpObm1IGqmbC9A5C.jpg', 106, '2016', 2, '6.90', 'Taki y Mitsuha descubren un día que durante el sueño sus cuerpos se intercambian, y comienzan a comunicarse por medio de notas. A medida que consiguen superar torpemente un reto tras otro, se va creando entre los dos un vínculo que poco a poco se conviert', 'Your Name.', 89),
(4, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wn0wOGqFKl5hF4If8ev78mn4LGY.jpg', 124, '2001', 2, '7', 'Chihiro es una niña de diez años que viaja en coche con sus padres. Después de atravesar un túnel, llegan a un mundo fantástico, en el que no hay lugar para los seres humanos, sólo para los dioses de primera y segunda clase. Cuando descubre que sus padres', 'El viaje de Chihiro ', 150),
(5, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/88qfHWhlOBYXp69277QFhdPYnWf.jpg', 97, '2017', 3, '6', 'Chris Redfield, de la BSAA, cuenta con la ayuda del agente del Gobierno Leon S. Kennedy y la profesora Rebecca Chambers del Instituto Alexander de Biotecnología, para parar a un mercader de la muerte que busca venganza, y amenaza con extender un virus mor', 'Resident Evil: Vendetta', 70),
(6, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/m54tK4wKjc1w2dp7QInG0munGao.jpg', 131, '1988', 1, '5.50', 'En lo alto de la ciudad de Los Ángeles, un grupo terrorista se ha apoderado de un edificio tomando a un grupo de personas como rehenes. Sólo un hombre, el policía de Nueva York John McClane (Bruce Willis), ha conseguido escapar del acoso terrorista. Aunqu', 'Die Hard ', 105),
(7, 'https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zvrs4RU6zSFzcRWdqZFWsGUAsOS.jpg', 132, '1979', 4, '6', 'Siglo XXIII. Al almirante James T. Kirk, de la nave Enterprise, se le encomienda una difícil misión: neutralizar un extraño cuerpo para evitar su colisión con la Tierra y la consiguiente catástrofe. El oficial Spock, el capitán Willard Decker, la asesora ', 'Star Trek: The Motion Picture', 99);

--
-- Volcado de datos para la tabla `peliculas_horarios`
--

INSERT INTO `peliculas_horarios` (`peliculas_id`, `horarios_id`) VALUES
(2, 1),
(2, 3);


COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
