package com.InheritanceSingleTable;

import com.InheritanceSingleTable.DaoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
      DaoImpl dao = new DaoImpl();
      dao.addVehicle();
    }
}
