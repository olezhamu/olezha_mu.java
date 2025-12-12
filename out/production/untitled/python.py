import sys
import json

def add(a, b):
    return a + b

if __name__ == '__main__':
    # Читаем из stdin JSON строку
    input_data = json.loads(sys.stdin.read())
    function_name = input_data['function']
    args = input_data['args']

    if function_name == 'add':
        result = add(*args)
        print(json.dumps({'result': result}))
    else:
        print(json.dumps({'error': 'Unknown function'}))