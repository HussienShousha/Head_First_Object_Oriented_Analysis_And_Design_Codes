public enum Wood {
    INDIAN_ROSEWOOD,SITKA,ALDER,MAHOGANY,ADIRONDACK,BRAZILTAN_ROSEWOOD,CEDAR,COCOBOLO,MAPLE;

    @Override
    public String toString() {
        switch (this){
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case SITKA:
                return "Sitka";
            case ALDER:
                return "Alder";
            case MAHOGANY:
                return "Mahogany";
            case ADIRONDACK:
                return "Adirondack";
            case BRAZILTAN_ROSEWOOD:
                return "Brazilian Rosewood";
            case CEDAR:
                return "Cedar";
            case COCOBOLO:
                return "Cocobolo";
            case MAPLE:
                return "Maple";
            default:return "unspecified";
        }
    }
}
