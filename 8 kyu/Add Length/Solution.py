def add_length(str_):
    output = []
    
    for element in str_.split(" "):
        output.append(f"{element} {len(element)}")
        
    return output
        