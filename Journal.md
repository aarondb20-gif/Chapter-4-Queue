# Journal

Phase 1
A Queue is better than a Stack for a message broker, because the First-In, First-Out structure will ensure that
the messages are sent in the right order (first message first). The Stack will print them in the opposite order, 
last message first.

Phase 2
Putting failed messages back to the end of the queue lets other fresh messages go first instead of getting stuck 
behind a single repeating error.
