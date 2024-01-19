MAX_SIZE = 5
queue = [None] * MAX_SIZE
front = rear = -1

def is_empty():
    return front == rear == -1

def is_full():
    return (rear + 1) % MAX_SIZE == front

def enqueue(item):
    global front, rear
    if is_full():
        print("Queue is full, cannot enqueue.")
    else:
        if is_empty():
            front = rear = 0
        else:
            rear = (rear + 1) % MAX_SIZE
        queue[rear] = item

def dequeue():
    global front, rear
    if is_empty():
        print("Queue is empty, cannot dequeue.")
        return None
    else:
        item = queue[front]
        if front == rear:
            front = rear = -1
        else:
            front = (front + 1) % MAX_SIZE
        return item

# Example usage:
enqueue(1)
enqueue(2)
enqueue(3)
print("Dequeued item:", dequeue())
enqueue(4)
enqueue(5)
enqueue(6)  # This will print "Queue is full, cannot enqueue."