package com.joe;

/**
 * egy interface egy szerzodes
 * nincs benne megvalositas csak azt mondaja meg hogy a metodusoknak hogy kell kinezniuk
 * csak metodus szignaturak talalhatoak benne
 */
public interface Shape {
    /**
     * az interface metodusoknak nincs implementacioja/megvalositasa
     * alapbol public az osszes metodus tehat nem kell kiirni
     * @return
     */
    double kerulet();
    double terulet();
}
