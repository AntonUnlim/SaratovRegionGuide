package com.unlim.saratovregionguide;

public class Region {

    private int ID;
    private String nominativeName;
    private String genitiveName;
    private String nominativeRegionalCenter;
    private String genitiveRegionalCenter;
    private String emblemPath;
    private String emblemDescription;
    private int distanceToSaratov;

    public Region(int ID,
            String nominativeName,
            String genitiveName,
            String nominativeRegionalCenter,
            String genitiveRegionalCenter,
            String emblemPath,
            String emblemDescription,
            int distanceToSaratov) {
        this.ID = ID;
        this.nominativeName = nominativeName;
        this.genitiveName = genitiveName;
        this.nominativeRegionalCenter = nominativeRegionalCenter;
        this.genitiveRegionalCenter = genitiveRegionalCenter;
        this.emblemPath = emblemPath;
        this.emblemDescription = emblemDescription;
        this.distanceToSaratov = distanceToSaratov;
    }

    public String getNominativeName() {return this.nominativeName;}

    public String getGenitiveName() {return this.genitiveName;}

    public String getNominativeRegionalCenter() {return this.nominativeRegionalCenter;}

    public String getGenitiveRegionalCenter(){return this.genitiveRegionalCenter;}

    public String getEmblemPath() {return this.emblemPath;}

    public String getEmblemDescription() {return this.emblemDescription;}

    public String getDistanceToSaratov() {return distanceToSaratov + " км";}

    public int getID() {return this.ID;}
}
