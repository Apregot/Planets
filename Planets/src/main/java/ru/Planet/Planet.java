package ru.Planet;

public enum Planet {
    MERCURY("Mercury is the smallest planet in the Solar System and the closest to the Sun."),
    VENUS("Venus is the second planet from the Sun. It is named after the Roman goddess of love and beauty."),
    EARTH("Earth is the third planet from the Sun and the only astronomical object known to harbour and support life."),
    MARS("Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury."),
    JUPITER("Jupiter is the fifth planet from the Sun and the largest in the Solar System. " +
            "It is a gas giant with a mass more than two and a half times that of all the other planets in the Solar System combined, " +
            "but slightly less than one-thousandth the mass of the Sun."),
    SATURN("Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter." +
            " It is a gas giant with an average radius of about nine and a half times that of Earth."),
    URANUS("Uranus is the seventh planet from the Sun. Its name is a reference to the Greek god of the sky, " +
            "Uranus, who, according to Greek mythology, was the great-grandfather of Ares (Mars), grandfather of Zeus (Jupiter) and father of Cronus (Saturn)."),
    NEPTUNE("Neptune is the eighth and farthest known Solar planet from the Sun. " +
            "In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet.");

    private String str;

    Planet(String str) {
        this.str = str;
    }

    public String getStr(){
        return str;
    }

}
