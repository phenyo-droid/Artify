package com.example.fuelmonitor.menu;

import android.content.Context;
import android.widget.Toast;

public class MenuController {

    public static void handleMenuClick(Context context, MenuItem item) {
        switch (item.getId()) {

            case "fuel_entry":
                Toast.makeText(context, "Open Fuel Entry Screen", Toast.LENGTH_SHORT).show();
                break;

            case "fuel_history":
                Toast.makeText(context, "Open Fuel History", Toast.LENGTH_SHORT).show();
                break;

            case "fuel_stats":
                Toast.makeText(context, "Open Stats & Reports", Toast.LENGTH_SHORT).show();
                break;

            case "settings":
                Toast.makeText(context, "Open Settings", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(context, "Menu item not found", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
