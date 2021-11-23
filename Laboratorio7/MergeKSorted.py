# MergeKSorted
# Author: Peña Ugarte David Jose
# Lista final de prioridad
# CUI: 20130875

import queue

entrada =[[1,4,5],[1,3,4],[2,6]]
salida=[]
priorityQueue = queue.PriorityQueue()
for i in entrada:
    for j in i: 
        print('# PriorityQ process:',priorityQueue.queue)
        priorityQueue.put(j)

print('Salida desordenada:',priorityQueue.queue)
while not priorityQueue.empty():
    salida.append(priorityQueue.get()) 
#print("# result: ---------------------------")
print('Salida ordenada:',salida)
