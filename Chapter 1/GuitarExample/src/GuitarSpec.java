public class GuitarSpec {
   private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private String numStrings;

    public GuitarSpec(Builder builder, String model,String numStrings ,Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings=numStrings;
    }

    public String getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(String numStrings) {
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
    public boolean matches(GuitarSpec otherSpec){
        if(builder!=otherSpec.getBuilder())
            return false;

        if((model!=null)&&(model!="")&&(!model.equals(otherSpec.getModel())))
            return false;
        if(type!=otherSpec.getType())
            return false;
        if(backWood!=otherSpec.getBackWood())
            return false;
        if(topWood!=otherSpec.getTopWood())
            return false;
        return true;

    }
}
