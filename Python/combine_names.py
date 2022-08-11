# Create a function named (combine_names) that accepts two parameters (first and last name). The function should return the full name.

def combine_names(*args):
    return ", ".join(args)

print(combine_names("Aliaksei", "Margo"))