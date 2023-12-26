package org.example.two;

public class Database extends БазаДаних{
    public String getUserData(){
        return отриматиДаніКористувача();
    }

    public String getStatisticsData(){
        return отриматиСтатистичніДані();
    }
}
