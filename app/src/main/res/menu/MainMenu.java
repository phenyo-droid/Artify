package com.example.fuelmonitor.menu;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    public static List<MenuItem> getMenuItems() {
        List<MenuItem> list = new ArrayList<>();

        list.add(new MenuItem(
                "fuel_entry",
                "Add Fuel Entry",
                "Capture litres, cost and date."
        ));

        list.add(new MenuItem(
                "fuel_history",
                "Fuel History",
                "View all your fuel logs."
        ));

        list.add(new MenuItem(
                "fuel_stats",
                "Reports & Statistics",
                "Graphs, averages and insights."
        ));

        list.add(new MenuItem(
                "settings",
                "Settings",
                "Adjust preferences and units."
        ));

        return list;
    }
}
