planet_dict = {1: "Mercury", 2: "Venus"}


def get_planet_name(id):
    # This doesn't work; Fix it!
    planets = {1: "Mercury", 2: "Venus", 3: "Earth", 4: "Mars", 5: "Jupiter", 6: "Saturn", 7: "Uranus", 8: "Neptune"}
    if id in list(planets.keys()):
        print(planets[id])
        return planets[id]
    else:
        assert print(Exception)




get_planet_name(0)
