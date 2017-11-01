-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 01 Novembre 2017 à 17:05
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `beerbook`
--

-- --------------------------------------------------------

--
-- Structure de la table `biere`
--

CREATE TABLE `biere` (
  `idB` int(11) NOT NULL,
  `photoB` varchar(25) DEFAULT NULL,
  `nomB` varchar(25) DEFAULT NULL,
  `pourcentB` varchar(25) DEFAULT NULL,
  `lieuBrassageB` varchar(25) DEFAULT NULL,
  `paysB` varchar(25) DEFAULT NULL,
  `noteB` int(11) DEFAULT NULL,
  `descriptionB` text,
  `idU` int(11) DEFAULT NULL,
  `testeLe` date DEFAULT NULL,
  `idLieu` int(11) DEFAULT NULL,
  `typeBiere` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `informations`
--

CREATE TABLE `informations` (
  `typeBiere` varchar(25) NOT NULL,
  `typeFermentation` text,
  `typeCereales` text,
  `accompagnement` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

CREATE TABLE `lieu` (
  `idLieu` int(11) NOT NULL,
  `nomLieu` varchar(25) DEFAULT NULL,
  `villeLieu` varchar(25) DEFAULT NULL,
  `typeLieu` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `idU` int(11) NOT NULL,
  `pseudoU` varchar(25) DEFAULT NULL,
  `ageU` int(11) DEFAULT NULL,
  `sexeU` varchar(25) DEFAULT NULL,
  `villeU` varchar(25) DEFAULT NULL,
  `paysU` varchar(25) DEFAULT NULL,
  `photoU` varchar(255) DEFAULT NULL,
  `mdpU` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idU`, `pseudoU`, `ageU`, `sexeU`, `villeU`, `paysU`, `photoU`, `mdpU`) VALUES
(1, 'beerbook', 0, 'M', 'BeerbookCity', 'BeerbookLand', 'imagesBeerbookppBeerbook.jpg', 'beerbook');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `biere`
--
ALTER TABLE `biere`
  ADD PRIMARY KEY (`idB`),
  ADD KEY `FK_Biere_idU` (`idU`),
  ADD KEY `FK_Biere_idLieu` (`idLieu`),
  ADD KEY `FK_Biere_typeBiere` (`typeBiere`);

--
-- Index pour la table `informations`
--
ALTER TABLE `informations`
  ADD PRIMARY KEY (`typeBiere`);

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD PRIMARY KEY (`idLieu`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`idU`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `biere`
--
ALTER TABLE `biere`
  MODIFY `idB` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `lieu`
--
ALTER TABLE `lieu`
  MODIFY `idLieu` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `idU` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `biere`
--
ALTER TABLE `biere`
  ADD CONSTRAINT `FK_Biere_idLieu` FOREIGN KEY (`idLieu`) REFERENCES `lieu` (`idLieu`),
  ADD CONSTRAINT `FK_Biere_idU` FOREIGN KEY (`idU`) REFERENCES `utilisateur` (`idU`),
  ADD CONSTRAINT `FK_Biere_typeBiere` FOREIGN KEY (`typeBiere`) REFERENCES `informations` (`typeBiere`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
