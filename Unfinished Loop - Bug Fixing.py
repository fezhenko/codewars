def create_array(n):
    res = []
    while True:
        res = [i for i in range(1, n+1) if 0 <= i <= n]
        print(res)
        break
    return res


print(create_array(10))