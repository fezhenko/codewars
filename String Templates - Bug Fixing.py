# def build_string(*args):
#     string = ", ".join(args)
#     a = f"I like {string}!"
#     return a

def build_string(*args):
    a = f"I like {', '.join(args)}!"
    return a
