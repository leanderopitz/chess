# Contributing Guidelines

This document describes how we work together on the Chess project. The goal is to keep our development process consistent, organized, and easy to follow.

Both contributors follow the same workflow.

## 1. General Workflow

All changes must be made in separate branches. We do not commit or push directly to `main`.

Our development workflow is:

1. Update the local `main` branch.
2. Create a new branch for the task.
3. Make changes and commit them.
4. Push the branch to GitHub.
5. Open a pull request.
6. Request a review from the other contributor.
7. Address feedback if necessary.
8. Merge the pull request after approval.
9. Delete the completed branch.

The `main` branch should always contain the latest reviewed version of the project.

## 2. Branching Strategy

### Creating a Branch

Before starting a new task, switch to `main` and pull the latest changes.

In IntelliJ IDEA:

1. Open the Git branch menu.
2. Select `main` and check it out.
3. Pull the latest changes from GitHub.
4. Create a new branch from `main`.

Every branch should focus on one specific task.

### Branch Naming

We use lowercase branch names with hyphens to separate words.

| Prefix | Purpose | Example |
|---|---|---|
| `feature/` | New features | `feature/chess-board` |
| `fix/` | Bug fixes | `fix/pawn-movement` |
| `docs/` | Documentation | `docs/update-readme` |
| `refactor/` | Code improvements without changing behavior | `refactor/game-logic` |
| `chore/` | Maintenance and configuration | `chore/project-setup` |
| `test/` | Adding or updating tests | `test/board-tests` |

Branch names should be short but descriptive.

### Working on a Branch

Multiple commits can be made on the same branch.

A new branch is not required for every small change. Related changes should be grouped together.

If a pull request is already open, additional commits pushed to the same branch will automatically appear in that pull request.

Do not reuse branches that have already been merged.

If multiple contributors work on related features, communicate before making changes to avoid unnecessary merge conflicts.

## 3. Commit Conventions

We use a consistent commit message format based on Conventional Commits, with `feature` instead of `feat`.

Each commit message should describe what changed.

### Format

`type: short description`

### Commit Types

| Type | Purpose | Example |
|---|---|---|
| `feature` | New functionality | `feature: add chess board` |
| `fix` | Bug fix | `fix: correct pawn movement` |
| `docs` | Documentation | `docs: update README` |
| `refactor` | Code restructuring | `refactor: simplify move validation` |
| `test` | Adding or updating tests | `test: add pawn movement tests` |
| `chore` | Maintenance | `chore: update gitignore` |

### Guidelines

- Write commit messages in English.
- Keep descriptions short and meaningful.
- Use lowercase descriptions, except for proper names and abbreviations.
- Use the imperative form, such as `add`, `fix`, or `update`.
- Avoid vague commit messages such as `update`, `changes`, or `fix stuff`. Always specify what was changed, e.g., `update README` instead of just `update`.
- Prefer separate commits for logically independent changes.
- Avoid mixing unrelated changes in a single commit.

For example:

Branch: `feature/chess-board`

Commit: `feature: add chess board`

## 4. Pull Requests

Every change to `main` must go through a pull request.

### Creating a Pull Request

After completing your changes:

1. Commit your work in IntelliJ IDEA.
2. Push your branch to GitHub.
3. Open the repository on GitHub.
4. Navigate to **Pull requests**.
5. Click **New pull request**, or use **Compare & pull request** if available.
6. Select the correct branches:
   - Base: `main`
   - Compare: your working branch
7. Enter a descriptive title.
8. Add a short description of the changes.
9. Click **Create pull request**.
10. Request a review from the other contributor.

### Pull Request Titles

Pull request titles should follow the same naming convention as commits.

Examples:

- `feature: add chess board`
- `fix: correct pawn movement`
- `docs: update README`

### Pull Request Descriptions

A pull request should briefly explain:

- What was changed?
- Why was the change necessary?
- How was it tested?

For small changes, a short description is sufficient.

For larger features, describe any important design decisions or known limitations.

A pull request does not need to contain a complete feature if it is explicitly marked as a draft.

### Draft Pull Requests

Use **Draft pull requests** when work is still in progress and not ready for approval.

Once the changes are ready for review, select **Ready for review**.

## 5. Code Reviews

Every pull request requires at least one approval before it can be merged into `main`.

Since we are two contributors, the person who did not create the pull request is responsible for reviewing it.

### Requesting a Review

After opening a pull request:

1. Find the **Reviewers** section on the right side.
2. Select the other contributor.
3. Wait for the review before merging.

### Reviewing a Pull Request

To review a pull request on GitHub:

1. Open the repository.
2. Navigate to **Pull requests**.
3. Select the pull request.
4. Read the description to understand the changes.
5. Open the **Files changed** tab.
6. Review the modified files.
7. Add comments to specific lines if necessary.
8. Click **Review changes** or **Finish your review**.
9. Select the appropriate review option.
10. Submit the review.

### Review Options

GitHub provides three main review options:

**Comment**

Use this to leave feedback or ask questions without approving or formally requesting changes.

**Approve**

Use this when the changes are correct, understandable, and ready to merge.

**Request changes**

Use this when something must be corrected before the pull request can be merged.

### Review Guidelines

When reviewing a pull request, check:

- Does the implementation match the intended task?
- Is the code understandable?
- Are there any obvious bugs or logical errors?
- Are names and structures consistent with the project?
- Are unnecessary files or unrelated changes included?
- Has the contributor tested the changes appropriately?
- Does the project still compile and run as expected?

Reviews should focus on improving the code, not just finding mistakes.

If something is unclear, ask a question rather than assuming it is wrong.

### Addressing Review Feedback

If changes are requested:

1. Read the review comments.
2. Make the necessary changes in the same local branch.
3. Commit the corrections.
4. Push the branch again.
5. Respond to the review comments if appropriate.
6. Request another review when the changes are ready.

A new pull request is not necessary.

New commits will automatically update the existing pull request.

Because our branch protection dismisses stale approvals, changes pushed after an approval may require another approval.

## 6. Merging Pull Requests

Pull requests can only be merged after the required review has been completed.

We use **Squash and merge** to keep the history of `main` clean.

### Merging a Pull Request

1. Open the approved pull request.
2. Check that all required reviews are complete.
3. Make sure all review conversations are resolved.
4. Click **Squash and merge**.
5. Review the final commit message.
6. Click **Confirm squash and merge**.

Squash merging combines the commits from a pull request into one commit on `main`.

Do not merge your own pull request before the other contributor has approved it.

### Deleting Branches

After a successful merge:

1. Click **Delete branch** on GitHub.
2. Return to IntelliJ IDEA.
3. Switch to `main`.
4. Pull the latest changes.
5. Delete the completed local branch.

Deleting a merged branch does not remove its changes from `main`.

## 7. GitHub Issues

We use GitHub Issues to keep track of planned work, bugs, and improvements.

An issue should describe a specific task or problem.

When creating an issue:

- Use a clear title.
- Explain what needs to be implemented or fixed.
- Include relevant details or requirements.
- Assign the issue to a contributor when appropriate.

If a branch or pull request addresses an issue, reference the issue number in the pull request description.

For example:

`Closes #12`

GitHub will automatically close the linked issue when the pull request is merged into the default branch.

Small documentation changes or minor corrections do not always require a separate issue.

## 8. Development Environment

The project currently uses:

- Java 25 (LTS)
- IntelliJ IDEA
- Git
- GitHub

### Local Setup

1. Clone the GitHub repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 25 as the project SDK.
4. Set the language level to `SDK default`.

Both contributors should use the same Java version.

Local IDE settings and generated build files should not be committed to GitHub.

Additional libraries, build tools, and development tools will be introduced as needed.

Before adding a new dependency, we should discuss whether it is necessary for the project.

## 9. Coding Guidelines

We aim to keep the code readable, consistent, and maintainable.

### General Principles

- Use meaningful names for classes, methods, and variables.
- Keep methods focused on a single responsibility.
- Avoid unnecessary complexity.
- Follow established Java naming conventions.
- Prefer readable code over overly clever implementations.
- Avoid duplicating code when a shared solution would be clearer.
- Keep unrelated changes out of feature branches.

### Naming Conventions

Follow standard Java naming conventions:

| Element | Convention | Example |
|---|---|---|
| Classes | PascalCase | `ChessBoard` |
| Methods | camelCase | `getPiece()` |
| Variables | camelCase | `currentPlayer` |
| Constants | UPPER_SNAKE_CASE | `BOARD_SIZE` |
| Packages | lowercase | `chess` |

### Comments

Comments should explain why something is done when the reasoning is not immediately obvious.

Avoid comments that simply repeat what the code already expresses.

### Code Formatting

Use IntelliJ IDEA's standard Java formatting settings unless we agree on project-specific conventions.

Try to keep formatting consistent across the project.

### Testing

New functionality should be tested before creating a pull request.

For now, manual testing is sufficient.

We may introduce automated tests once the project becomes more complex.

Any newly introduced testing framework should be agreed upon by both contributors.

## 10. General Guidelines

- Keep changes focused on one task.
- Do not push directly to `main`.
- Do not force-push to `main`.
- Avoid committing temporary files or local environment settings.
- Pull the latest changes before creating a new branch.
- Communicate when working on overlapping parts of the project.
- Review each other's changes before merging.
- Keep documentation up to date when the project changes.
- Prefer understandable solutions over unnecessary complexity.

These guidelines may be updated as the project develops.