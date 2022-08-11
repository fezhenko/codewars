def _if(bool, func1, func2):
    func1() if bool else func2()


a = b = c = d = e = f = False


def truthy():
    print("True")


def falsey():
    print("False")


_if(a, truthy, falsey)


def test__if():
    a = b = c = d = e = False

    def a1():
        assert True
        nonlocal a
        a = True

    def a2():
        assert False, "Should respond to True correctly"

    def b1():
        assert False, "Should support falsy/truthy values"

    def b2():
        assert True
        nonlocal b
        b = True

    def c1():
        assert True
        nonlocal c
        c = True

    def c2():
        assert False, "Should support falsy/truthy values"

    def d1():
        assert True
        nonlocal d
        d = True

    def d2():
        assert False, "Should support comparison"

    def e1():
        assert True
        nonlocal e
        e = True

    def e2():
        assert False, "Should support comparison"

    _if(True, a1, a2)
    _if(False, b1, b2)
    _if(1, c1, c2)
    _if((3 < 4), d1, d2)
    _if((9 % 3 == 0), e1, e2)

    assert a and b and c and d and e
