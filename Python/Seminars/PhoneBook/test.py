

class Human:
    def __init__(self, name: str, age: int, work: str):
        self.name = name
        self.age = age
        self.work = work

    def __str__(self):
        return f'{self.name}, {self.age} years old works in {self.work}'
    
    def working(self):
        print(f'{self.name} began work in {self.work}')


hum_1 = Human('Herman', 19, 'GeekBrains')
hum_1.working()

hum_2 = Human('Anastasia', 18, 'Yandex')
hum_2.working()

