Singtel test

Please find attached the source code for the animal project.

The general approach I took was to to minimize inheritance and leverage composition via granular interfaces. 

What isn't needed, isn't provided for. For example, there's several ways to approach a butterfly/caterpillar, but inheritance doesn't really add much benefit for this project. A butterly has completely different operations/attributes to a caterpillar, but it's the same organism, so I chose to instantiate a butterfly from a caterpillar, copying identity only - if there was any. Both are insects, but that abstraction wasn't neccessary to complete the task, same with mammal for cat/dog/dolphin etc. Some methods unique to a particular animal - like shark.eatFish() were not abstracted into an interface either, if was necessary I would have done so.

Overview of classes:

![Class Diagram](https://github.com/daharper/animal/blob/master/class_diagram1.png)

Overview of classes and behaviors:

![Class Diagram](https://github.com/daharper/animal/blob/master/class_diagram2.png)
