# Git & GitHub Setup Guide for Automation Framework

## ✅ What We've Done So Far

1. ✓ Initialized Git repository locally
2. ✓ Created `.gitignore` file (ignores target/, logs, IDE files, etc.)
3. ✓ Updated README.md with comprehensive documentation
4. ✓ Made initial commit with all framework files

## 📋 Step-by-Step Guide to Connect with GitHub

### Step 1: Create a GitHub Account (if you don't have one)
- Go to https://github.com/signup
- Sign up with your email
- Verify your email address

### Step 2: Create a New Repository on GitHub
1. Go to https://github.com/new
2. Fill in the following details:
   - **Repository name**: `automation-amazon`
   - **Description**: "Amazon Login Automation Hybrid Framework using Selenium, Cucumber, and Maven"
   - **Public or Private**: Choose based on your preference
   - **Initialize with**: Do NOT check "Add a README" (we already have one)
   - Click "Create Repository"

### Step 3: Connect Local Repository to GitHub
Copy and paste these commands in PowerShell in your project directory:

```powershell
cd D:\Workspace\automation-amazon
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/automation-amazon.git
git push -u origin main
```

Replace `YOUR_USERNAME` with your actual GitHub username.

### Step 4: Verify Connection
```powershell
git remote -v
```

You should see:
```
origin  https://github.com/YOUR_USERNAME/automation-amazon.git (fetch)
origin  https://github.com/YOUR_USERNAME/automation-amazon.git (push)
```

---

## 🔄 Daily Workflow with Git

### When Adding New Features:

```powershell
# 1. Create a new feature branch
git checkout -b feature/add-payment-page

# 2. Make your changes to the files
# Example: Add new page class, step definitions, etc.

# 3. Check what files changed
git status

# 4. Stage your changes
git add src/

# 5. Commit with a meaningful message
git commit -m "Add payment page object with validation methods"

# 6. Push to GitHub
git push origin feature/add-payment-page
```

### Common Git Commands:

```powershell
# View commit history
git log

# View changes in detail
git log --oneline -10  # Last 10 commits

# See differences in files
git diff

# Check current branch
git branch

# List all branches
git branch -a

# Switch to existing branch
git checkout main

# Create and switch to new branch
git checkout -b feature/your-feature-name

# Update main branch with latest changes
git pull origin main

# Merge feature branch to main
git checkout main
git merge feature/your-feature-name
git push origin main
```

---

## 🔀 Creating a Pull Request (Recommended Workflow)

1. **Push your feature branch to GitHub**
   ```powershell
   git push origin feature/add-payment-page
   ```

2. **Go to GitHub repository**
   - You'll see a prompt to "Compare & pull request"
   - Click that button

3. **Fill in Pull Request Details**
   - Title: Clear description of changes
   - Description: What was changed and why
   - Add relevant labels/reviewers

4. **Merge After Code Review**
   - Click "Merge pull request"
   - Delete the feature branch

---

## 📚 Commit Message Best Practices

### Good Commit Messages:
```
git commit -m "Add LoginPage password field methods"
git commit -m "Fix element locator for Create Account button"
git commit -m "Refactor DriverManager for better resource handling"
git commit -m "Add extent report configuration"
```

### Bad Commit Messages:
```
git commit -m "changes"
git commit -m "fixed bugs"
git commit -m "work in progress"
```

### Commit Message Format:
```
<type>: <subject>

<body (optional)>
```

**Types**: feat, fix, docs, style, refactor, test, chore

---

## 🏷️ Tagging Releases

```powershell
# Create a tag for version 1.0.0
git tag -a v1.0.0 -m "Release version 1.0.0 - Initial framework setup"

# Push tags to GitHub
git push origin --tags

# View all tags
git tag -l
```

---

## 🔐 GitHub Security Tips

1. **Use SSH Keys** (More secure than HTTPS)
   ```powershell
   # Generate SSH key
   ssh-keygen -t ed25519 -C "your.email@example.com"
   
   # Add to GitHub: Settings → SSH and GPG keys → New SSH key
   ```

2. **Never Commit Sensitive Data**
   - Passwords
   - API keys
   - Database credentials
   - Use environment variables instead

3. **Use `.gitignore` Properly**
   - Already configured for:
     - target/ (Maven build files)
     - .idea/ (IntelliJ)
     - .vscode/ (VS Code)
     - allure-results/ (Test reports)
     - *.log (Log files)

---

## 🐛 Undoing Changes

```powershell
# Undo last commit (keep changes)
git reset --soft HEAD~1

# Undo last commit (discard changes)
git reset --hard HEAD~1

# Discard changes in specific file
git checkout -- filename.java

# View previous versions
git log --oneline
git show <commit-hash>
```

---

## 👥 Collaboration Tips

1. **Always Pull Before Pushing**
   ```powershell
   git pull origin main
   git push origin feature-branch
   ```

2. **Keep Branches Up to Date**
   ```powershell
   git fetch origin
   git rebase origin/main
   ```

3. **Resolve Merge Conflicts**
   - Edit conflicting files
   - Use git add and git commit

---

## 📊 Useful GitHub Features

1. **Issues**: Report bugs and track features
2. **Projects**: Organize work with Kanban boards
3. **Wiki**: Documentation for your project
4. **Discussions**: Community discussions
5. **Actions**: CI/CD automation (optional)

---

## 🎯 Next Steps

1. Update your GitHub username in this guide
2. Create your GitHub repository
3. Run the commands from "Step 3: Connect Local Repository to GitHub"
4. Verify on GitHub that your code is uploaded
5. Start using the daily workflow for new features

---

## ❓ Need Help?

- GitHub Docs: https://docs.github.com
- Git Cheat Sheet: https://github.github.com/training-kit/downloads/github-git-cheat-sheet.pdf
- Git Tutorial: https://git-scm.com/book/en/v2

---

**Your local repository is ready! Follow the steps above to push it to GitHub.** 🚀
