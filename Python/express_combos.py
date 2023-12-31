event_amount = int(input('Enter the events amount: '))
event = []
for i in range(event_amount):
    event[i] = input('Enter the event: ')#.append(event)
print(f'Events amount = {event_amount}')
print(event)