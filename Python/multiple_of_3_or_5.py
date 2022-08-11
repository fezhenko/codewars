def multiple_of_3_or_5(x):
    if x > 0:
        try:
            new_list = []
            for i in range(0, x):
                if i % 3 == 0 and new_list.count(i) == 0:
                    new_list.append(i)
                elif i % 5 == 0 and new_list.count(i) == 0:
                    new_list.append(i)
                else:
                    continue
            print(new_list)
            print(f"Sum = {sum(new_list)}")
            return sum(new_list)
        except:
            print("Error")
    else:
        print("Error ha-ha")


def ogo(x):
    if x > 0:
        new_list = []
        [new_list.append(i) for i in range(0, x) if new_list.count(i) == 0 and (i % 3 == 0 or i % 5 == 0)]
        print(new_list)
        print(sum(new_list))
        return sum(new_list)
    else:
        assert print("error")


multiple_of_3_or_5(16)
ogo(16)
