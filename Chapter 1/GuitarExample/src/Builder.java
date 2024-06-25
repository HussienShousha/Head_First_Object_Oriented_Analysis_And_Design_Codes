public enum Builder {
    RYAN, PRS, COLLINGS, OLSON, MARTIN, FENDER, GIBSON;

    public String toString() {
        switch (this) {
            case RYAN:
                return "Ryan";
            case PRS:
                return "PRS";
            case COLLINGS:
                return "Collings";
            case OLSON:
                return "Olson";
            case MARTIN:
                return "Martin";
            case FENDER:
                return "Fender";
            case GIBSON:
                return "Gibson";
            default:
                return "unspecified";
        }
    }
}