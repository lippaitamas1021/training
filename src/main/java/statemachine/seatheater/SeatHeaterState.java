package statemachine.seatheater;

public enum SeatHeaterState {

    ONE { public SeatHeaterState next() { return OFF; }},
    TWO { public SeatHeaterState next() { return ONE; }},
    THREE { public SeatHeaterState next() { return TWO; }},
    OFF { public SeatHeaterState next() { return THREE; }};

    public abstract SeatHeaterState next();
}

