def create_array(n):
    res = []
    while True:
        res = [i for i in range(1, n+1) if 0 <= i <= n]
        break
    return res


print(create_array(10))