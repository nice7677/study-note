package kr.springboot.pattern.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter buggatiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(buggatiVeyronAdapter.getSpeed());
        // 431.30312

    }

}
