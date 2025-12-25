# Banking Core System 

This project demonstrates basic banking account modelling
using Object-Oriented Programming principles.

## Concepts Covered
- Encapsulation of balance and operations
- Polymorphism via account types
- Abstract base class for extensibility

## Day 1 - Banking Relevance
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

## Day 6 – End-of-Day Batch Processing
Introduced end-of-day batch processing to apply interest in a
controlled manner. This reflects real banking operations where
financial computations are processed after cut-off times to
ensure consistency and auditability.

## Day 7 – Persistence-Ready Design
Introduced stable internal identifiers for accounts and linked
transactions using account IDs. This prepares the domain model
for relational database persistence while preserving audit
integrity.

## Day 8 – SQL & Query Thinking
Designed relational table mappings and core SQL queries for
transaction history, reconciliation, and balance verification.
Index strategies are considered to ensure performance at scale.

## Day 9 – Testing & Failure Scenarios
Identified critical failure scenarios across account operations,
ledger integrity, and batch processing. Designed the system to
fail explicitly, protect audit data, and support recovery using
the transaction ledger as the source of truth.

## Day 10 - Portfolio