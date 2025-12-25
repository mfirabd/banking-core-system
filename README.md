# Banking Core System (Day 1)

This project demonstrates basic banking account modelling
using Object-Oriented Programming principles.

## Concepts Covered
- Encapsulation of balance and operations
- Polymorphism via account types
- Abstract base class for extensibility

## Banking Relevance
Banks often support multiple account types with different
interest and rule sets. This design allows new account types
to be added without modifying existing logic.

## Day 2 – Design Improvement
Interest calculation was refactored using the Strategy Pattern.
This decouples volatile business rules from stable domain models,
allowing new interest rules to be added without modifying existing
account classes.
