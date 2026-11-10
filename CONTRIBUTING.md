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

In PyCharm:

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

Branch names should be short but descriptive.

### Working on a Branch

Multiple commits can be made on the same branch.

A new branch is not required for every small change. Related changes should be grouped together.

If a pull request is already open, additional commits pushed to the same branch will automatically appear in that pull request.

Do not reuse branches that have already been merged.

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

For example:

Branch: `feature/chess-board`

Commit: `feature: add chess board`

## 4. Pull Requests

Every change to `main` must go through a pull request.

### Creating a Pull Request

After completing your changes:

1. Commit your work in PyCharm.
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

Reviews should focus on improving the code, not just finding mistakes.

If something is unclear, ask a question rather than assuming