package fr.esiee.fpic.labs:
    abstract class Shape:
        def scale(a: Float): Shape

        // Parameter-less methods: Two takes:
        def show(): Unit

        def area: Float
        def perimeter: Float
