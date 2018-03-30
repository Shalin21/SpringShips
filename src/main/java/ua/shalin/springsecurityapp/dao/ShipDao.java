package ua.shalin.springsecurityapp.dao;

import ua.shalin.springsecurityapp.model.Ship;


import java.util.List;

public interface ShipDao {

    public void addShip(Ship Ship);

    public List<Ship> getAllShips();

    public void deleteShip(Integer ShipId);

    public Ship updateShip(Ship Ship);

    public Ship getShip(int Shipid);

}
