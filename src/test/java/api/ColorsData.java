package api;

public class ColorsData {
    private Integer id;
    private String name;
    private Integer year;
    private String color;
    private String pantone_vales;

    public ColorsData(Integer id, String name, Integer year, String color, String pantone_vales) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.color = color;
        this.pantone_vales = pantone_vales;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPantone_vales() {
        return pantone_vales;
    }
}
