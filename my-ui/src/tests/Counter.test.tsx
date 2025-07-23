import Counter from "../counter.tsx";
import "@testing-library/jest-dom"
import {describe, expect, it} from "vitest";
import {act, render, screen} from "@testing-library/react";

describe('Counter', () => {
        it('Should display default counter value', () => {
            render(<Counter label="Test Counter"/>)
            expect(screen.getByText("Test Counter: 0")).toBeInTheDocument()
        })

        it("Should increment the counter when increment button is clicked", () => {
            render(<Counter label="Test Counter"/>)
            act(() => screen.getByText("Increment").click())
            expect(screen.getByText("Test Counter: 1")).toBeInTheDocument()
        })

        it("Should decrement the counter when decrement button is clicked", () => {
            render(<Counter label="Test Counter"/>)
            act(() => screen.getByText("Decrement").click())
            expect(screen.getByText("Test Counter: -1")).toBeInTheDocument()
        })
    }
)






