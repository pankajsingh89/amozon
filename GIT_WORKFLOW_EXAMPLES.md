# Git Workflow Examples

## Example 1: Adding a New Page Object

```powershell
# Create feature branch
git checkout -b feature/add-account-page

# Create new page class (e.g., AccountPage.java)
# Add step definitions in AccountSteps.java
# Add feature file scenarios in account.feature

# Check changes
git status

# Stage files
git add src/test/java/com/amazon/pages/AccountPage.java
git add src/test/java/com/amazon/steps/AccountSteps.java
git add src/test/resources/features/account.feature

# Commit
git commit -m "Add AccountPage with verification and navigation methods"

# Push to GitHub
git push origin feature/add-account-page
```

---

## Example 2: Fixing a Bug

```powershell
# Create bugfix branch
git checkout -b bugfix/fix-login-locator

# Fix the locator in LoginPage.java
# Update related step definitions if needed

# Verify the fix locally
mvn clean test

# If tests pass:
git add src/test/java/com/amazon/pages/LoginPage.java
git commit -m "Fix: Update email field locator for sign-in page"
git push origin bugfix/fix-login-locator
```

---

## Example 3: Refactoring Utilities

```powershell
# Create refactor branch
git checkout -b refactor/improve-wait-conditions

# Improve DriverManager.java or TestUtil.java
# Update all references if method signatures change

# Stage changes
git add src/test/java/com/amazon/utils/

# Commit
git commit -m "Refactor: Enhance wait conditions in DriverManager"
git push origin refactor/improve-wait-conditions
```

---

## Example 4: Adding Documentation

```powershell
# Create docs branch
git checkout -b docs/add-framework-setup-guide

# Update README.md with new sections
# Create documentation files

git add README.md
git add docs/
git commit -m "Docs: Add comprehensive framework setup guide"
git push origin docs/add-framework-setup-guide
```

---

## Example 5: Release Process

```powershell
# Make sure main branch is up to date
git checkout main
git pull origin main

# Create release tag
git tag -a v1.1.0 -m "Release v1.1.0: Added payment page automation"

# Push tag
git push origin v1.1.0

# On GitHub, create Release Notes from this tag
```

---

## Branch Naming Conventions

Use these prefixes for branches:

- `feature/` - New features
  - `feature/add-checkout-page`
  - `feature/add-payment-methods`

- `bugfix/` - Bug fixes
  - `bugfix/fix-element-timeout`
  - `bugfix/fix-extent-report`

- `refactor/` - Code refactoring
  - `refactor/improve-wait-strategy`
  - `refactor/simplify-driver-init`

- `docs/` - Documentation updates
  - `docs/update-readme`
  - `docs/add-setup-guide`

- `chore/` - Maintenance tasks
  - `chore/update-dependencies`
  - `chore/configure-ci`

---

## Viewing Changes Before Commit

```powershell
# See all unstaged changes
git diff

# See all staged changes
git diff --staged

# See changes in specific file
git diff src/test/java/com/amazon/pages/LoginPage.java

# See last 3 commits
git log -3 --oneline

# See detailed changes in a commit
git show <commit-hash>
```

---

## Synchronizing with Team

```powershell
# Get latest changes from GitHub without merging
git fetch origin

# See what's different
git log --oneline main..origin/main

# Merge remote changes into local
git merge origin/main

# Or rebase (cleaner history)
git rebase origin/main

# Push your changes
git push origin main
```

---

## Emergency Commands

```powershell
# Accidentally committed? Undo last commit (keep changes)
git reset --soft HEAD~1

# Accidentally committed wrong files? Undo hard
git reset --hard HEAD~1

# Already pushed? Create new commit to fix it
git revert <commit-hash>
git push origin main

# Wrong branch? Stash changes and switch
git stash
git checkout correct-branch
git stash pop

# Lost a commit? Find it
git reflog
git checkout <lost-commit-hash>
```

---

## .gitignore Examples Already Configured

Your `.gitignore` already excludes:

```
# Maven build artifacts
target/

# IDE files (IntelliJ, VS Code)
.idea/
.vscode/
*.iml
*.swp

# Test reports
allure-results/
cucumber-report.html
extent-report.html
surefire-reports/

# OS files
.DS_Store
Thumbs.db

# Logs
*.log
logs/

# Environment
.env
.env.local
```

Don't commit these! They'll be ignored automatically.

---

## Useful Git Aliases

```powershell
# Add these to make commands shorter:
git config --global alias.co checkout
git config --global alias.br branch
git config --global alias.ci commit
git config --global alias.st status
git config --global alias.log1 "log --oneline"

# Now you can use:
git co feature/add-page       # Instead of git checkout
git br                        # Instead of git branch
git ci -m "message"           # Instead of git commit
git st                        # Instead of git status
git log1                      # Instead of git log --oneline
```

---

## GitHub Desktop Alternative

If you prefer GUI over CLI:

1. Download: https://desktop.github.com
2. Sign in with GitHub account
3. Clone repository
4. Make changes in IDE
5. Commit and push from GitHub Desktop
6. No terminal commands needed!

---

## CI/CD Setup (Optional - Future Enhancement)

GitHub Actions can automatically:
- Run tests on every push
- Generate reports
- Deploy to servers
- Run code quality checks

Configuration file: `.github/workflows/maven.yml`

Example coming soon...

---

**Master these workflows and you'll be a Git pro!** 🎉
