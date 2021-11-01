# def stringy(size):
#     string = []
#     for i in range(0, size):
#         if i == 0:
#             i = 1
#             string += [i]
#         elif i % 2 == 0:
#             i = 1
#             string += [i]
#         else:
#             i = 0
#             string += [i]
#     str_string = "".join(str(int) for int in string)
#     return str_string


def stringy(size):
    return "".join([str(i % 2) for i in range(1, size + 1)])

print(stringy(10))