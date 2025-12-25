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

## Day 3 – Transaction Ledger
Introduced a Transaction domain object and transaction history
per account. This models real banking ledgers where balance is
derived from transaction records rather than treated as a single
source of truth.

## Day 4 – Domain Exceptions & Validation
Replaced generic exceptions with domain-specific banking exceptions.
Validation is enforced at the domain level, producing clear,
auditable error messages suitable for financial systems.

## Day 5 – Immutable Ledger & Audit Safety
Transactions are immutable, uniquely identified, and timestamped.
The transaction ledger is exposed as a read-only view to prevent
external mutation, preserving audit integrity.
