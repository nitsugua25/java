package TP10.observator;

public class Client {
    public static void main(String[] args) {
        WeatherChannel weatherChannel = new WeatherChannel();
        DisplayCondition displayCondition = new DisplayCondition();
        DisplayStatistics displayStatistics = new DisplayStatistics();

        weatherChannel.add(displayCondition);
        weatherChannel.add(displayStatistics);

        weatherChannel.addData(7,40);
        weatherChannel.addData(8,20);
        weatherChannel.addData(27,75);

    }
}
